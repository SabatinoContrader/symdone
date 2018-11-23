import { Component, OnInit } from "@angular/core";
import { SintomoService } from "src/services/sintomo.service";
import { Router } from "@angular/router";

@Component({
    selector:'app-gestioneSintomo',
    templateUrl:'./gestioneSintomo.component.html',
    styleUrls:['./gestioneSintomo.component.css']
})

export class GestioneSintomoComponent implements OnInit{

    constructor(private sintomoService:SintomoService, private router:Router){

    }

    ngOnInit(){
        
    }

}