import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
import { DatiBiomediciService } from "src/services/datiBiomedici.service";

@Component({
    selector:'app-insertDatiBiomedici',
    templateUrl:'./insertDatiBiomedici.component.html',
    styleUrls:['./insertDatiBiomedici.component.css']
})

export class InsertDatiBiomediciComponent implements OnInit{

    constructor(private datiBiomediciService:DatiBiomediciService, private router:Router){

    }

    ngOnInit(){
        
    }

    insert(f:NgForm) {
        
        this.datiBiomediciService.newDatiBiomedici(f.value.idpaziente, f.value.idmedico, f.value.idsensore,f.value.risultato,f.value.data).subscribe((response) => {
            if (response != null) {
              this.router.navigateByUrl("/readDatiBiomedici");
            }
        })
    }
}
