import { Component, OnInit } from "@angular/core";
import { Esame } from "../../models/Esame";
import { EsameService } from "../../services/esame.service";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
import { updateClassProp } from "@angular/core/src/render3/styling";
@Component({
selector:"app-esame", 
templateUrl :"./esame.component.html",
styleUrls :[ "./esame.component.css"]
})

export class EsameComponent implements OnInit{
    esameList :Esame[];
     resul: string;
     constructor(private esameService : EsameService,private router: Router){
 
     }
 
 ngOnInit(){
     this.esameService.readEsame().subscribe(response => {
        console.log("marti sei mitica");
        this.esameList=response;
        console.log(response);
            });
        }
        deleteEsame(id:string){
            console.log("---------"+id);
            this.esameService.deleteEsame(id).subscribe(async(Response)=>{   
            await this.ngOnInit();
        
        
            })
            
        }
        
        
        }