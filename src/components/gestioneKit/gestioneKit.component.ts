import { Component, OnInit } from "@angular/core";
import { KitService } from "src/services/kit.service";
import { Router } from "@angular/router";

@Component({
    selector:'app-gestioneKit',
    templateUrl:'./gestioneKit.component.html',
    styleUrls:['./gestioneKit.component.css']
})

export class GestioneKitComponent implements OnInit{

    constructor(private kitService:KitService, private router:Router){

    }

    ngOnInit(){
        
    }

}