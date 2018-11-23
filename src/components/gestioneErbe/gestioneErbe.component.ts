import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { ErbaService } from "src/services/erba.service";

@Component({
    selector:'app-gestioneErbe',
    templateUrl:'./gestioneErbe.component.html',
    styleUrls:['./gestioneErbe.component.css']
})

export class GestioneErbeComponent implements OnInit{

    constructor(private erbaService:ErbaService, private router:Router){

    }

    ngOnInit(){
        
    }

}