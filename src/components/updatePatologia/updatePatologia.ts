import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Router } from "@angular/router";
//import { Patologia } from "src/models/Patologia";
import { NgForm } from "@angular/forms";

/*@Component({
    selector: 'app-updatePatologia',
    templateUrl: '',
    styleUrls: ['']
})*/

export class UpdatePatologiaComponent implements OnInit{

    //public patologia : Array<Patologia>
    
    /*constructor(private patologiaService:PatologiaService, private router:Router){

    }*/

    ngOnInit(){
       // this.patologiaService.readPatologia().subscribe((response) => {
            //this.patologia = response;
       //})

    }

    /*update(f:NgForm){
        this.patologiaService.update(f.value.idpatologia, f.value.patologia, f.value.descrizione).subscribe((response) => {
            if(response != null){
                this.router.navigateByUrl("/gestionePatologia");
            }

            
        })
    
    }*/

}