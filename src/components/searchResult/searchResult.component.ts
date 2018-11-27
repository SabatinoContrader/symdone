import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Router, ActivatedRoute } from "@angular/router";
import { Sintomo } from "src/models/Sintomo";
import { SearchPatologiaService } from "src/services/searchPatologia.service";
import { NgForm } from "@angular/forms";
import { Patologia } from "src/models/Patologia";
import { Erba } from "src/models/Erba";
import { Esame } from "src/models/Esame";
import { Medico } from "src/models/Medico";

@Component({
    selector:'app-searchResult',
    templateUrl:'./searchResult.component.html',
    styleUrls:['./searchResult.component.css']
})

export class SearchResultComponent implements OnInit{

    public listPatologie: Array<Patologia>;
    public listErbe: Array<Erba>;
    public listEsame: Array<Esame>;
    public listMedico: Array<Medico>;
    idsintomo: string;
    idsintomo2: string;
    idsintomo3: string;

    constructor(private searchPatologiaService:SearchPatologiaService, private router: Router, private route: ActivatedRoute){

    }

    ngOnInit(){
        //list sintomo
        this.idsintomo = this.route.snapshot.paramMap.get('idsintomo');
        console.log("ID :( :" + this.idsintomo);
        this.idsintomo2 = this.route.snapshot.paramMap.get('idsintomo2');
        console.log("ID :P :" + this.idsintomo2);
        this.idsintomo3 = this.route.snapshot.paramMap.get('idsintomo3');
        console.log("ID :D :" + this.idsintomo3);
        this.searchPatologiaService.readListPatologie(this.idsintomo).subscribe((response) => {
        this.listPatologie = response;
        }) 
        //list erbe un elemento
        this.searchPatologiaService.readListErbe(this.idsintomo).subscribe((response) => {
        this.listErbe = response;
        }) 
        //list erbe due elementi
        this.searchPatologiaService.readListErbeTwo(this.idsintomo,this.idsintomo2).subscribe((response) => {
        this.listErbe = response;
        }) 
        //list erbe tre elementi
        this.searchPatologiaService.readListErbeThree(this.idsintomo,this.idsintomo2,this.idsintomo3).subscribe((response) => {
        this.listErbe = response;
        }) 
        //list Esami
        this.searchPatologiaService.readListEsame(this.idsintomo).subscribe((response) => {
        this.listEsame = response;
        }) 
        //list Esami due elementi
        this.searchPatologiaService.readListEsameTwo(this.idsintomo,this.idsintomo2).subscribe((response) => {
        this.listEsame = response;
        })
        //list Esami tre elementi
        this.searchPatologiaService.readListEsameThree(this.idsintomo,this.idsintomo2,this.idsintomo3).subscribe((response) => {
        this.listEsame = response;
        }) 
        //list Medici
        this.searchPatologiaService.readListMedici(this.idsintomo).subscribe((response) => {
        this.listMedico = response;
        }) 
        //list Medici due elementi
        this.searchPatologiaService.readListMediciTwo(this.idsintomo,this.idsintomo2).subscribe((response) => {
        this.listMedico = response;
        })
        //list Medici tre elementi
        this.searchPatologiaService.readListMediciThree(this.idsintomo,this.idsintomo2,this.idsintomo3).subscribe((response) => {
        this.listMedico = response;
        })

    }
   
}