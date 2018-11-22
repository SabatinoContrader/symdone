import { Component, OnInit } from "@angular/core";
import { DatiBiomediciService } from "src/services/datiBiomedici.service";
import { Router } from "@angular/router";

@Component({
    selector:'app-gestioneDatiBiomedici',
    templateUrl:'./gestioneDatiBiomedici.component.html',
    styleUrls:['./gestioneDatiBiomedici.component.css']
})

export class GestioneDatiBiomediciComponent implements OnInit{

    constructor(private datiBiomediciService:DatiBiomediciService, private router:Router){

    }

    ngOnInit(){
        
    }

}