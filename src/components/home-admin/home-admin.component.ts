import { Router } from '@angular/router';
import { Component, OnInit } from "@angular/core";
import { MedicoService } from "../../services/medico.service";

@Component({
  selector: "app-home-admin",
  templateUrl: "./home-admin.component.html",
  styleUrls: ["./home-admin.component.css"]
})

export class HomeAdminComponent implements OnInit {
  
  constructor(private medicoService: MedicoService, private router: Router) { }

  ngOnInit() {
    this.medicoService.deleteFeedback();
  }

  logout(){
    sessionStorage.clear();
    this.router.navigateByUrl("/login");
  }
}
