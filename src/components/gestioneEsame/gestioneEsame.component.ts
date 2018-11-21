import { componentFactoryName } from "@angular/compiler";
import { OnInit, Component } from "@angular/core";
import { EsameService } from "src/services/esame.service";
import { Router } from "@angular/router";

@Component({
    selector: 'app-gestioneEsame',
    templateUrl: './gestioneEsame.component.html',
    styleUrls:['./gestioneEsame.component.css']
})

export class GestioneEsameComponent implements OnInit{

    constructor(private esameService:EsameService, private router:Router){

    }
    ngOnInit(){}
}