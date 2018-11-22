import { Router } from '@angular/router';
import { Component, OnInit } from "@angular/core";
import { MedicoService } from "../../services/medico.service";
import { Medico } from 'src/models/Medico';
import { async } from '@angular/core/testing';

@Component({
  selector: "app-gestioneMedico",
  templateUrl: "./gestioneMedico.component.html",
  styleUrls: ["./gestioneMedico.component.css"]
})

export class GestioneMedicoComponent implements OnInit {
  
  public medici: Array<Medico> 
  idMedico: string
  constructor(private medicoService: MedicoService, private router: Router) { }

  ngOnInit() {
    this.medicoService.findAll().subscribe((response) =>{
      this.medici=response;
    } );
  }
  
  modificaMed(idmedico: String){
    this.router.navigateByUrl("/updateMedico?id="+idmedico);
  }

  delete(idmedico: String){
    this.medicoService.delete(idmedico).subscribe(async(response)=> {
      await this.ngOnInit();
    })

  }

  logout(){
    sessionStorage.clear();
    this.router.navigateByUrl("/login");
  }
}
