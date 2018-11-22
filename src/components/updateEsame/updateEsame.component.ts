import { Component, OnInit } from "@angular/core";
import { Esame } from "../../models/Esame";
import { EsameService } from "../../services/esame.service";
import { Router, ActivatedRoute } from "@angular/router";
import { NgForm } from "@angular/forms";

@Component({
selector:"app-updateEsame", 
templateUrl :"./updateEsame.component.html",
styleUrls :[ "./updateEsame.component.css"]
})

export class UpdateEsameComponent implements OnInit{
   EsameList :Esame[];
    resul: string;
    idesame: string;
    esame: string ="";
    descrizione: string = "";

    constructor(private EsameService : EsameService, private route: ActivatedRoute, private router: Router){
    }

    ngOnInit(){
        console.log("Rinaldo");
        this.idesame = this.route.snapshot.queryParams.idesame;
        this.descrizione = this.route.snapshot.queryParams.descrizione;
        this.esame = this.route.snapshot.queryParams.Esame;
        console.log(this.idesame);
    
    }
    updateEsame(f: NgForm, idesame:string){
        console.log(idesame+" "+f.value.esame+" "+f.value.descrizione);
        this.EsameService.updateEsame(idesame,f.value.esame,f.value.descrizione).subscribe((Response)=>{         
            this.router.navigateByUrl("/esame");
         });
    }
    
    }