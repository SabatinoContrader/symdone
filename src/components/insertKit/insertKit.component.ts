import { Component, OnInit } from "@angular/core";
import { KitService } from "src/services/kit.service";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";

@Component({
    selector:'app-insertKit',
    templateUrl:'./insertKit.component.html',
    styleUrls:['./insertKit.component.css']
})

export class InsertKitComponent implements OnInit{

    constructor(private kitService:KitService, private router:Router){

    }

    ngOnInit(){
        
    }

    register(f:NgForm){
        
        this.kitService.newKit(f.value.tipoKit,f.value.descrizioneKit,f.value.software).subscribe((response) => {
           
            if (response != null) {
              this.router.navigateByUrl("/readKit");
            }
        })
    }
}