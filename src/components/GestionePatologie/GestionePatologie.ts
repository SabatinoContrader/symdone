import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Router } from "@angular/router";

/*@Component({
    selector:'app-gestionePatologie',
    templateUrl:'',
    styleUrls:['']
})*/

export class GestionePatologieComponent implements OnInit{

    constructor(private patologiaService:PatologiaService, private router:Router){

    }

    ngOnInit(){
        
    }

}