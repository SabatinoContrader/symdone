import { Component, OnInit } from "@angular/core";
import { Sensore } from "../../models/Sensore";
import { SensoreService } from "../../services/sensore.service";
import { Router, ActivatedRoute } from "@angular/router";
import { NgForm } from "@angular/forms";
@Component({
selector:"app-updateSensore", 
templateUrl :"./updateSensore.component.html",
styleUrls :[ "./updateSensore.component.css"]
})

export class UpdateSensoreComponent implements OnInit{
   erbaSensore :Sensore[];
    resul: string;
    idsensore: string;
    tipoSensore: string = "";
    specificheSensore: string ="";

    constructor(private sensoreService : SensoreService, private route: ActivatedRoute, private router: Router){

    }

ngOnInit(){
    console.log("MIKI");
    this.idsensore = this.route.snapshot.queryParams.idsensore;
    this.tipoSensore = this.route.snapshot.queryParams.tipoSensore;
    this.specificheSensore = this.route.snapshot.queryParams.specificheSensore;
    console.log(this.idsensore);

}
updateSensore(f: NgForm, idsensore:string){
    console.log(idsensore+" "+f.value.tipoSensore+" "+f.value.specificheSensore);
    this.sensoreService.updateSensore(idsensore,f.value.tipoSensore,f.value.specificheSensore).subscribe((Response)=>{         
        this.router.navigateByUrl("/sensori");
     });
}

}
