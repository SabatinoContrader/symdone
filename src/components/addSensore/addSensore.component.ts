import { Component, OnInit } from '@angular/core';
import { Sensore } from 'src/models/Sensore';
import { Router } from '@angular/router';
import { SensoreService } from 'src/services/sensore.service';
import { NgForm } from "@angular/forms";

@Component({
  selector: 'app-addSensore',
  templateUrl: './addSensore.component.html',
  styleUrls :[ "./addSensore.component.css"]
})
export class AddSensoreComponent implements OnInit {

 sensoreList :Sensore[];
  resul: string;
  constructor(private sensoreService : SensoreService,private router: Router){
    
  }
  ngOnInit(){

    }
    insertSensore(f:NgForm){
        this.sensoreService.insertSensore(f.value.tipoSensore, f.value.specificheSensore).subscribe((response)=>{
     
         if (response != null) {
             this.router.navigateByUrl("/sensori");
           }
        });




  }

}