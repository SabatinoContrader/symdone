import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { SensoreService } from "src/services/sensore.service";

@Component({
    selector:'app-gestioneSensori',
    templateUrl:'./gestioneSensori.component.html',
    styleUrls:['./gestioneSensori.component.css']
})

export class GestioneSensoriComponent implements OnInit{

    constructor(private sensoreService:SensoreService, private router:Router){

    }

    ngOnInit(){
        
    }

}