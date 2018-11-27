import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
import { DatiBiomedici } from "src/models/DatiBiomedici";
import { DatiBiomediciService } from "src/services/datiBiomedici.service";
import { User } from "src/models/User";

@Component({
    selector:'app-readDatiBiomedici',
    templateUrl:'./readDatiBiomedici.component.html',
    styleUrls:['./readDatiBiomedici.component.css']
})

export class ReadDatiBiomediciComponent implements OnInit{
    
    public datiBiomedici : Array<DatiBiomedici>;
   
    

     constructor(private datiBiomediciService:DatiBiomediciService, private router: Router){

     }

     ngOnInit(){
         
         this.datiBiomediciService.readDatiBiomedici().subscribe((response) => {
             this.datiBiomedici = response;
         }) 
        }
         delete(idcartella:string) {
        
           this.datiBiomediciService.delete(idcartella).subscribe(async(response) => {
await this.ngOnInit();})
     }
}