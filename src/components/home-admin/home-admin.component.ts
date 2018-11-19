import { Router } from '@angular/router';
import { Component, OnInit } from "@angular/core";
import { CarService } from "../../services/car.service";

@Component({
  selector: "app-home-admin",
  templateUrl: "./home-admin.component.html",
  styleUrls: ["./home-admin.component.css"]
})

export class HomeAdminComponent implements OnInit {
  
  constructor(private carService: CarService, private router: Router) { }

  ngOnInit() {
    this.carService.deleteFeedback();
  }

  logout(){
    sessionStorage.clear();
    this.router.navigateByUrl("/login");
  }
}
