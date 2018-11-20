import { Component, OnInit } from "@angular/core";
import { Erba } from "../../models/Erba";
import { ErbaService } from "../../services/erba.service";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
@Component({
selector:"app-addErba", 
templateUrl :"./addErba.component.html",
styleUrls :[ "./addErba.component.css"]
})

export class AddErbaComponent implements OnInit{
   erbaList :Erba[];
    resul: string;

    constructor(private erbaService : ErbaService,private router: Router){

    }

ngOnInit(){

}



insertErba(f:NgForm){
   this.erbaService.insertErba(f.value.erba, f.value.descrizione).subscribe((response)=>{

    if (response != null) {
        this.router.navigateByUrl("/erba");
      }
   });
      
   
}
  }