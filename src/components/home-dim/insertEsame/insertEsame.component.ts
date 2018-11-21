import { Component, OnInit } from "@angular/core";
import { EsameService } from "src/services/esame.service";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";

@Component({
    selector:'app-insertEsame',
    templateUrl:'./insertEsame.component.html',
    styleUrls:['./insertEsame.component.css']
})

export class InsertEsameComponent implements OnInit{

    constructor(private esameService:EsameService, private router:Router){

    }

    ngOnInit(){
        
    }

    register(f:NgForm){
        
        this.esameService.insertEsame(f.value.esame,f.value.descrizione).subscribe((response) => {
            console.log("esame =???????? "+f.value.esame + "descrizione = ????"+f.value.descrizione);
            if (response != null) {
              this.router.navigateByUrl("/esame");
            }
        })
    }
}