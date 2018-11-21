import { Component, OnInit } from "@angular/core";
import { SintomoService } from "src/services/sintomo.service";
import { Router } from "@angular/router";

import { Sintomo } from "src/models/Sintomo";
import { NgForm } from "@angular/forms";
import { async } from "@angular/core/testing";

@Component({
    selector:'app-readSintomo',
    templateUrl:'./readSintomo.component.html',
    styleUrls:['./readSintomo.component.css']
})

export class ReadSintomoComponent implements OnInit{
    
    public sintomo : Array<Sintomo>;

     constructor(private sintomoService:SintomoService, private router: Router){

     }

     ngOnInit(){
         this.sintomoService.readSintomo().subscribe((response) => {
             this.sintomo = response;
         }) 
        }

         delete(id:string){
       
            this.sintomoService.delete(id).subscribe(async(response) => {
            
               await this.ngOnInit();
                
            })
            

     }
}