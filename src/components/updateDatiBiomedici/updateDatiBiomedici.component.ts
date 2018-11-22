import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Router, ActivatedRoute } from "@angular/router";
import { Patologia } from "src/models/Patologia";
import { NgForm } from "@angular/forms";
import { DatiBiomediciService } from "src/services/datiBiomedici.service";

@Component({
    selector: 'app-updateDatiBiomedici',
    templateUrl: './updateDatiBiomedici.component.html',
    styleUrls: ['./updateDatiBiomedici.component.css']
})

export class UpdateDatiBiomediciComponent implements OnInit{

   // public patologia : Array<Patologia>;
    public idcartella: string;
     risultato: string="";
     data: string="";


    
    constructor(private datiBiomediciService:DatiBiomediciService, private router:Router, private route: ActivatedRoute){
    }

    ngOnInit(){
    
            this.idcartella=this.route.snapshot.queryParams.idcartella;
            this.risultato=this.route.snapshot.queryParams.risultato;
            this.data=this.route.snapshot.queryParams.data;
            console.log(this.idcartella)
       }

    

    update(f:NgForm){
        this.datiBiomediciService.update(f.value.idcartella, f.value.risultato, f.value.data).subscribe((response) => {
            if(response != null){
                this.router.navigateByUrl("/readDatiBiomedici");
            }

        })
    

    }

}