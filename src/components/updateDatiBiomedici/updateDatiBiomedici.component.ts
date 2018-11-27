import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Router, ActivatedRoute } from "@angular/router";
import { Patologia } from "src/models/Patologia";
import { NgForm } from "@angular/forms";
import { DatiBiomediciService } from "src/services/datiBiomedici.service";
import { User } from "src/models/User";
import { Medico } from "src/models/Medico";
import { Sensore } from "src/models/Sensore";

@Component({
    selector: 'app-updateDatiBiomedici',
    templateUrl: './updateDatiBiomedici.component.html',
    styleUrls: ['./updateDatiBiomedici.component.css']
})

export class UpdateDatiBiomediciComponent implements OnInit{

   // public patologia : Array<Patologia>;
   public medico:Array <Medico>;
    public idcartella: string;
    idpaziente: string="";
    idmedico: string="";
    idsensore: string=" ";
     data: string="";
     public user :Array<User>;
     public sensore:Array<Sensore>;

    
    constructor(private datiBiomediciService:DatiBiomediciService, private router:Router, private route: ActivatedRoute){
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
    
            this.idcartella=this.route.snapshot.queryParams.idcartella;
            this.idpaziente=this.route.snapshot.queryParams.idpaziente;
            this.idmedico=this.route.snapshot.queryParams.idmedico;
            this.idsensore=this.route.snapshot.queryParams.idsensore;
            this.data=this.route.snapshot.queryParams.data;
       }

    

    update(f:NgForm){
        this.datiBiomediciService.update(f.value.idcartella,f.value.idpaziente, f.value.idmedico, f.value.idsensore, f.value.data).subscribe((response) => {
            if(response != null){
                this.router.navigateByUrl("/readDatiBiomedici");
            }

        })
    

    }

}