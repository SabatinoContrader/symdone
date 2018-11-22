import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Router, ActivatedRoute } from "@angular/router";
import { Patologia } from "src/models/Patologia";
import { NgForm } from "@angular/forms";

@Component({
    selector: 'app-updatePatologia',
    templateUrl: './updatePatologia.component.html',
    styleUrls: ['./updatePatologia.component.css']
})

export class UpdatePatologiaComponent implements OnInit{

   // public patologia : Array<Patologia>;
    public idpatologia: string;
     patologia: string="";
     descrizione: string="";


    
    constructor(private patologiaService:PatologiaService, private router:Router, private route: ActivatedRoute){
    }

    ngOnInit(){
    
        //this.patologiaService.readPatologia().subscribe((response) => {
            //this.patologia = response;
            this.idpatologia=this.route.snapshot.queryParams.idpatologia;
            this.patologia=this.route.snapshot.queryParams.patologia;
            this.descrizione=this.route.snapshot.queryParams.descrizione;
            console.log(this.idpatologia)
       }

    

    update(f:NgForm){
        this.patologiaService.update(f.value.idpatologia, f.value.patologia, f.value.descrizione).subscribe((response) => {
            console.log("idpatologia="+f.value.idpatologia+ "patologia="+f.value.patologia+ "descrizione="+f.value.descrizione);
            if(response != null){
                this.router.navigateByUrl("/readPatologia");
            }

        })
    

    }

}