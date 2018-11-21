import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Router } from "@angular/router";
import { Patologia } from "src/models/Patologia";
import { NgForm } from "@angular/forms";

@Component({
    selector:'app-readPatologia',
    templateUrl:'./readPatologia.component.html',
    styleUrls:['./readPatologia.component.css']
})

export class ReadPatologiaComponent implements OnInit{
    
    public patologia : Array<Patologia>;

     constructor(private patologiaService:PatologiaService, private router: Router){

     }

     ngOnInit(){
         this.patologiaService.readPatologia().subscribe((response) => {
             this.patologia = response;
         }) 
        }
         delete(idpatologia:string) {
        
            this.patologiaService.delete(idpatologia).subscribe(async(response) => {
    ;
    await this.ngOnInit();
                
            })
        }
}