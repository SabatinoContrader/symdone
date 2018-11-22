import { Component, OnInit } from "@angular/core";
import { Erba } from "../../models/Erba";
import { ErbaService } from "../../services/erba.service";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
import { updateClassProp } from "@angular/core/src/render3/styling";
@Component({
selector:"app-erba", 
templateUrl :"./erba.component.html",
styleUrls :[ "./erba.component.css"]
})

export class ErbaComponent implements OnInit{
   erbaList :Erba[];
    resul: string;
    constructor(private erbaService : ErbaService,private router: Router){

    }

ngOnInit(){
    this.erbaService.readErba().subscribe(response => {
console.log("marti sei mitica");
this.erbaList=response;
console.log(response);
    });
}
deleteErba(id:string){
    console.log("---------"+id);
    this.erbaService.deleteErba(id).subscribe(async(Response)=>{   
    await this.ngOnInit();


    })
    
}


}

