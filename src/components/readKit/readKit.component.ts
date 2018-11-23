import { Component, OnInit } from "@angular/core";
import { KitService } from "src/services/kit.service";
import { Router } from "@angular/router";

import { Kit } from "src/models/Kit";
import { NgForm } from "@angular/forms";
import { async } from "@angular/core/testing";

@Component({
    selector:'app-readKit',
    templateUrl:'./readKit.component.html',
    styleUrls:['./readKit.component.css']
})

export class ReadKitComponent implements OnInit{
    
    public kit : Array<Kit>;

     constructor(private kitService:KitService, private router: Router){

     }

     ngOnInit(){
         this.kitService.readKit().subscribe((response) => {
             this.kit = response;
         }) 
        }
        delete(idkit:string) {
        
            this.kitService.delete(idkit).subscribe(async(response) => {
    ;
    await this.ngOnInit();
                
            })
        }
    }