import { Component, OnInit, EventEmitter, Output } from "@angular/core";
import { NgForm } from "@angular/forms";
import { UserService } from "../../services/user.service";
import { User } from "../../models/User";
import { Router, NavigationExtras } from '@angular/router';

@Component({
  selector: "app-signup",
  templateUrl: "./signup.component.html",
  styleUrls: ["./signup.component.css"]
})

export class SignupComponent implements OnInit {
  //feedback: string;
  public allruolo: Array<User>;

  constructor(private userService: UserService, private router: Router) { 

  }

  ngOnInit() {

  }

  //Dichiaro un'Array di tre elementi
  ruoloUser = [{id:0,ruolo:"Seleziona il Ruolo..."},{id:1,ruolo:"Admin"},{id:2,ruolo:"Doctor"},{id:3,ruolo:"Patient"}];

  signup(f: NgForm){
    this.userService.signup(f.value.username, f.value.password, f.value.ruolo, f.value.name, f.value.surname, f.value.phone,f.value.email).subscribe((response) => {
      console.log("sei entrato qui!!" + f.value.username);
      if (response != null) {
        
        this.router.navigateByUrl("/login");
      }

    });
  }


  
}
