import { ActivatedRoute, Router, ActivationEnd } from '@angular/router';
import { Component, OnInit } from "@angular/core";
import { MedicoService } from "../../services/medico.service";
import { Medico } from 'src/models/Medico';
import { identifierModuleUrl } from '@angular/compiler';
import { NgForm } from '@angular/forms';

@Component({
  selector: "app-updateMedico",
  templateUrl: "./updateMedico.component.html",
  styleUrls: ["./updateMedico.component.css"]
})

export class UpdateMedicoComponent implements OnInit {
  
  public idmed:string;
  public medici: Medico

  constructor(private medicoService: MedicoService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit() {
      this.idmed = this.route.snapshot.queryParams.idmed;
      this.medicoService.readOne(this.idmed).subscribe((response) =>{
      this.medici=response;
    } );
  }
  
  update(f: NgForm){
      console.log(f.value.idmed);
      console.log(f.value.nomeMedico);
      console.log(f.value.cognomeMedico);
      console.log(f.value.specializzazioneMedico);
      console.log(f.value.indirizzoMedico);
      console.log(f.value.mailMedico);

      this.medicoService.update(f.value.idmed,f.value.nomeMedico,f.value.cognomeMedico,f.value.specializzazioneMedico, f.value.indirizzoMedico, f.value.mailMedico).subscribe((response)=> {
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