import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
import { Patologia } from "src/models/Patologia";

/*@Component({
    selector:'app.deletePatologia',
    templateUrl:'',
    styleUrls: ['']
})*/

export class DeletePatologiaComponent implements OnInit{

    //public patologia: Array<Patologia>;

    constructor(private patologiaService:PatologiaService, private router:Router){

    }

    ngOnInit(){
        /*this.patologiaService.readPatologia().subscribe((response) => {
           this.patologia = response;
        })*/
    }

    /*delete(f:NgForm){
        this.patologiaService.delete(f.value.idpatologia).subscribe((response) => {
            if(response != null){
                this.router.navigateByUrl("gestionePatologia")
            }
        })

    }*/


}