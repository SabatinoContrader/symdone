import { Component, OnInit } from "@angular/core";
import { KitService } from "src/services/kit.service";
import { Router,ActivatedRoute, ActivationEnd } from "@angular/router";
import { Kit } from "src/models/Kit";
import { NgForm } from "@angular/forms";

@Component({
    selector: 'app-updateKit',
    templateUrl: './updateKit.component.html',
    styleUrls: ['./updateKit.component.css']
})

export class UpdateKitComponent implements OnInit{

    public kit : Array<Kit>
    public idkit: string;
    tipoKit: string ="";
    descrizioneKit:string="";
    software:string="";
   
    
    constructor(private kitService:KitService, private router:Router, private route:ActivatedRoute){

    }

    ngOnInit(){
    
         this.idkit= this.route.snapshot.queryParams.idkit;
         this.tipoKit=this.route.snapshot.queryParams.tipoKit;
         this.descrizioneKit=this.route.snapshot.queryParams.descrizioneKit;
         this.software=this.route.snapshot.queryParams.software;
        }

    

    update(f:NgForm){
      
        this.kitService.update(f.value.idkit, f.value.tipoKit, f.value.descrizioneKit, f.value.software ).subscribe((response) => {
            if(response != null){
                this.router.navigateByUrl("/readKit");
            }

            
        })
    }

}