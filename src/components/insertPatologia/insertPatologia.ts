import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";

@Component({
    selector:'app-insertPatologia',
    templateUrl:'./insertPatologia.component.html',
    styleUrls:['./insertPatologia.component.css']
})

export class InsertPatologiaComponent implements OnInit{

    constructor(private patologiaService:PatologiaService, private router:Router){

    }

    ngOnInit(){
        
    }

    register(f:NgForm){
        
        this.patologiaService.newPatologia(f.value.patologia,f.value.descrizione).subscribe((response) => {
            console.log("patologia2 = "+f.value.patologia);
            if (response != null) {
              this.router.navigateByUrl("/gestionePatologia");
            }
        })
    }
}
