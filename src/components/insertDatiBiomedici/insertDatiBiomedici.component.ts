import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
import { DatiBiomediciService } from "src/services/datiBiomedici.service";
import { User } from "src/models/User";
import { Medico } from "src/models/Medico";
import { Sensore } from "src/models/Sensore";

@Component({
    selector:'app-insertDatiBiomedici',
    templateUrl:'./insertDatiBiomedici.component.html',
    styleUrls:['./insertDatiBiomedici.component.css']
})

export class InsertDatiBiomediciComponent implements OnInit{
    public user :Array<User>;
    public medico:Array <Medico>;
    public sensore:Array<Sensore>;

    constructor(private datiBiomediciService:DatiBiomediciService, private router:Router){

    }

    ngOnInit(){
        this.datiBiomediciService.readPazienti().subscribe((response)=>{
            this.user= response;
        })
        this.datiBiomediciService.readMedici().subscribe((response)=>{
            this.medico=response;
    })
        this.datiBiomediciService.readSensori().subscribe((response)=>{
        this.sensore=response;
})
}

    insert(f:NgForm) {
        
        this.datiBiomediciService.newDatiBiomedici(f.value.idpaziente, f.value.idmedico, f.value.idsensore,f.value.risultato,f.value.data).subscribe((response) => {
            if (response != null) {
              this.router.navigateByUrl("/readDatiBiomedici");
            }
        })
    }
}
