import { Component, OnInit } from "@angular/core";
import { Erba } from "../../models/Erba";
import { ErbaService } from "../../services/erba.service";
import { Router, ActivatedRoute } from "@angular/router";
import { NgForm } from "@angular/forms";
@Component({
selector:"app-updateErba", 
templateUrl :"./updateErba.component.html",
styleUrls :[ "./updateErba.component.css"]
})

export class UpdateErbaComponent implements OnInit{
   erbaList :Erba[];
    resul: string;
    iderba: string;
    descrizione: string = "";
    erba: string ="";

    constructor(private erbaService : ErbaService, private route: ActivatedRoute, private router: Router){

    }

ngOnInit(){
    console.log("Rinaldo");
    this.iderba = this.route.snapshot.queryParams.iderba;
    this.descrizione = this.route.snapshot.queryParams.descrizione;
    this.erba = this.route.snapshot.queryParams.erba;
    console.log(this.iderba);

}
updateErba(f: NgForm, iderba:string){
    console.log(iderba+" "+f.value.erba+" "+f.value.descrizione);
    this.erbaService.updateErba(iderba,f.value.erba,f.value.descrizione).subscribe((Response)=>{         
        this.router.navigateByUrl("/erba");
     });
}

}
