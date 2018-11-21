import { Component, OnInit } from "@angular/core";
import { SintomoService } from "src/services/sintomo.service";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";

@Component({
    selector:'app-insertSintomo',
    templateUrl:'./insertSintomo.component.html',
    styleUrls:['./insertSintomo.component.css']
})

export class InsertSintomoComponent implements OnInit{

    constructor(private sintomoService:SintomoService, private router:Router){

    }

    ngOnInit(){
        
    }

    register(f:NgForm){
        
        this.sintomoService.newSintomo(f.value.nome).subscribe((response) => {
            console.log("ci sono io")
            console.log("nomeSintomo = "+f.value.nome);
            if (response != null) {
              this.router.navigateByUrl("/readSintomo");
            }
        })
    }
}