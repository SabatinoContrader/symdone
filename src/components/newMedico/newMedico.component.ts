import { ActivatedRoute, Router, ActivationEnd } from '@angular/router';
import { Component, OnInit } from "@angular/core";
import { MedicoService } from "../../services/medico.service";
import { Medico } from 'src/models/Medico';
import { identifierModuleUrl } from '@angular/compiler';
import { NgForm } from '@angular/forms';

@Component({
  selector: "app-newMedico",
  templateUrl: "./newMedico.component.html",
  styleUrls: ["./newMedico.component.css"]
})

export class NewMedicoComponent implements OnInit {
  
  public idmed:string;
  public medici: Medico

  constructor(private medicoService: MedicoService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {}
    
  
  insert(f: NgForm){
      /*console.log(f.value.nomeMedico);
      console.log(f.value.cognomeMedico);
      console.log(f.value.specializzazioneMedico);
      console.log(f.value.indirizzoMedico);
      console.log(f.value.mailMedico);*/

      this.medicoService.newMedico(f.value.nomeMedico,f.value.cognomeMedico,f.value.specializzazioneMedico, f.value.indirizzoMedico, f.value.mailMedico).subscribe((response)=> {
          if (response != null) {
            this.router.navigateByUrl("/gestioneMedico")
          }
      })
  }

  logout(){
    sessionStorage.clear();
    this.router.navigateByUrl("/login");
  }
}