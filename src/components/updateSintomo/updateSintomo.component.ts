import { Component, OnInit } from "@angular/core";
import { SintomoService } from "src/services/sintomo.service";
import { Router,ActivatedRoute, ActivationEnd } from "@angular/router";
import { Sintomo } from "src/models/Sintomo";
import { NgForm } from "@angular/forms";

@Component({
    selector: 'app-updateSintomo',
    templateUrl: './updateSintomo.component.html',
    styleUrls: ['./updateSintomo.component.css']
})

export class UpdateSintomoComponent implements OnInit{

    public sintomo : Array<Sintomo>
    public idsintomo: string;
    nomeSintomo: string ="";
   
    
    constructor(private sintomoService:SintomoService, private router:Router, private route:ActivatedRoute){

    }

    ngOnInit(){
    
         this.idsintomo= this.route.snapshot.queryParams.idsintomo;
         this.nomeSintomo=this.route.snapshot.queryParams.nomeSintomo;
        }

    

    update(f:NgForm){
        console.log(f.value.idsintomo);
        console.log(f.value.nomeSintomo);
        this.sintomoService.update(f.value.idsintomo, f.value.nomeSintomo).subscribe((response) => {
            if(response != null){
                this.router.navigateByUrl("/readSintomo");
            }

            
        })
    }

}