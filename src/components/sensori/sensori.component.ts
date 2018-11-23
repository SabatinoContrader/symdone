import { Component, OnInit } from '@angular/core';
import { Sensore } from 'src/models/Sensore';
import { Router } from '@angular/router';
import { SensoreService } from 'src/services/sensore.service';

@Component({
  selector: 'app-sensori',
  templateUrl: './sensori.component.html',
  styleUrls: ['./sensori.component.css']
})
export class SensoreComponent implements OnInit {

 sensoreList :Sensore[];
  resul: string;
  constructor(private sensoreService : SensoreService,private router: Router){

  }

  ngOnInit(){
    this.sensoreService.readSensore().subscribe(response => {
console.log("ecco i sensori");
this.sensoreList=response;
console.log(response);
    });
}
deleteSensore(id:string){
    console.log("---------"+id);
    this.sensoreService.deleteSensore(id).subscribe(async(Response)=>{   
    await this.ngOnInit();


    })
    
}

}
