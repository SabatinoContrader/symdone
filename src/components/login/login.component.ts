import { Component, OnInit } from '@angular/core';
import { UserService } from "src/services/user.service";
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
//import { User } from '../../models/User';
import { User } from "src/models/User";
//import { UserService } from '../../services/user.service';



/*@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
}) */

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
  //feedback: string;
  user: User;

  constructor(private userService: UserService, private router: Router){

  }

  ngOnInit(){
    //this.feedback = this.userService.feedback;
    //this.userService.deleteFeedback();
    console.log("Ci sei???");
  }

  /*login(f: NgForm): void{
      this.userService.login(f.value.username, f.value.password).subscribe((response) => {
        if (response != null) {
          this.user = response;
          sessionStorage.setItem("user", JSON.stringify(this.user));
          if(response.id_ruolo == 1)
            this.router.navigateByUrl("/homeDriver");
          else if(response.id_ruolo == 0)
            this.router.navigateByUrl("/homeOwner");
        } else
            this.feedback = "Username o password errati";
      });
  }*/

  login(f: NgForm): void{
    console.log("mi arrivano username="+ f.value.username + " password= "+ f.value.password);
    this.userService.login(f.value.username, f.value.password).subscribe((response) => {

      if (response != null) {
          this.user=response;
          sessionStorage.setItem("user", JSON.stringify(this.user));

          if(response.idRuolo==0)
           this.router.navigateByUrl("/login");
           else if(response.idRuolo==1)
           this.router.navigateByUrl("/homeAdmin");
           else if(response.idRuolo==2)
           this.router.navigateByUrl("/homeDoctor");
           else if(response.idRuolo==3)
           this.router.navigateByUrl("/homeDim");

      }

  });
  }


}
