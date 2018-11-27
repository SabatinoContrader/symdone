import { Component, OnInit } from "@angular/core";
import { PatologiaService } from "src/services/patologia.service";
import { Sintomo } from "src/models/Sintomo";
import { SearchPatologiaService } from "src/services/searchPatologia.service";
import { NgForm } from "@angular/forms";
import { Patologia } from "src/models/Patologia";
import { Router, ActivatedRoute } from "@angular/router";

@Component({
    selector:'app-searchPatologie',
    templateUrl:'./searchPatologie.component.html',
    styleUrls:['./searchPatologie.component.css']
})

export class SearchPatologieComponent implements OnInit{

    public listSintomo : Array<Sintomo>;
    public listPatologie : Array<Patologia>;
    public tmp1: string;
    public tmp2: string;
    public tmp3: string;
    public count = 0 ;

    constructor(private searchPatologiaService:SearchPatologiaService, private router: Router,  private route: ActivatedRoute){

    }

    ngOnInit(){
        this.searchPatologiaService.readListSintomi().subscribe((response) => {
            this.listSintomo = response;
        }) 
        
    }

    register(f:NgForm){
        this.count+=1;            
        
        if(this.count == 1){
            this.tmp1 = f.value.idsintomo;
            console.log("ecco count1: " + this.count + "ecco tmp1: " + this.tmp1);
            this.searchPatologiaService.newChoice(f.value.idsintomo).subscribe((response) => {
                console.log("IDSintomoComponent1 = "+f.value.idsintomo);
                console.log("size1 "+response.length);
                if (response != null) {
                    console.log("ci sono io??!!!!");
                     this.listSintomo = response;
                     this.router.navigateByUrl("/searchPatologie");
                }
            });
        }
        else if(this.count == 2){
            this.tmp2 = f.value.idsintomo;
            console.log("ecco count2(yes): " + this.count + " ecco tmp2(yes): " + this.tmp2 + " era tmp1(yes): " + this.tmp1);
            this.searchPatologiaService.newChoiceTwoElement(this.tmp1,f.value.idsintomo).subscribe((response) => {
                console.log("IDSintomoComponent2 = "+f.value.idsintomo);
                console.log("size2 "+response.length);
                if (response != null) {
                    console.log("ci sono io???!!!!");
                     this.listSintomo = response;
                     this.router.navigateByUrl("/searchPatologie");
                }
            });
        }
        else if(this.count == 3){
            this.tmp3 = f.value.idsintomo;
            console.log("ecco count2(yes): " + this.count + " ecco tmp2(yes): " + this.tmp2 + " era tmp1(yes): " + this.tmp1 );
            this.searchPatologiaService.newChoiceThreeElement(this.tmp1,this.tmp2,this.tmp3).subscribe((response) => {
                console.log("IDSintomoComponent2 = "+f.value.idsintomo);
                console.log("size2 "+response.length);
                if (response != null) {
                    console.log("ngulu?????!!!!");
                     //this.listPatologie = response;
                     //this.router.navigateByUrl("/searchResult/" + this.tmp3);
                }
            });

            this.searchPatologiaService.readListErbeThree(this.tmp1,this.tmp2,this.tmp3).subscribe((response) => {   
                if (response != null) {
                    console.log("ngulu Erbe?????!!!!");
                    //this.router.navigateByUrl("/searchResult/"+this.tmp2);
                }
            });

            this.searchPatologiaService.readListEsameThree(this.tmp1,this.tmp2,this.tmp3).subscribe((response) => {   
                if (response != null) {
                    //this.router.navigateByUrl("/searchResult/"+this.tmp1+"/"+this.tmp2+"/"+this.tmp3);
                    console.log("ci sono i risultati oggi (Yes or No ;D)!!");
                }
            });

            this.searchPatologiaService.readListMediciThree(this.tmp1,this.tmp2,this.tmp3).subscribe((response) => {   
                if (response != null) {
                    this.count = 0;
                    this.router.navigateByUrl("/searchResult/"+this.tmp1+"/"+this.tmp2+"/"+this.tmp3);
                }
            });
        }
    }

    searchResult(f:NgForm){
        console.log("ci sono i risultati!!");
        if(this.count == 1){
        this.searchPatologiaService.readListPatologie(this.tmp1).subscribe((response) => {
            console.log("IDSintomoComponentResult1 = " + this.tmp1);
            console.log("size1 "+response.length);
            if (response != null) {
                 console.log("ci sono i risultati oggi (Yes ;D)!!!!");
            }
        });

        this.searchPatologiaService.readListErbe(this.tmp1).subscribe((response) => {   
            if (response != null) {
                console.log("ci sono i risultati oggi (Yes or No ;D)!!");
            }
        });

        this.searchPatologiaService.readListEsame(this.tmp1).subscribe((response) => {   
            if (response != null) {
                //this.router.navigateByUrl("/searchResult/"+this.tmp1);
                console.log("ci sono i risultati oggi (Yes or No or false ;DS)!!");
            }
        });

        this.searchPatologiaService.readListMedici(this.tmp1).subscribe((response) => {   
            if (response != null) {
                this.count = 0;
                this.router.navigateByUrl("/searchResult/"+this.tmp1+"/"+this.tmp2+"/"+this.tmp3);
            }
        });

        }
        else if(this.count == 2){
            console.log("IDSintomoComponentResult2Tmp1 = " + this.tmp1 + "IDSintomoComponentResult2IDSintomo ="+this.tmp2);
            this.searchPatologiaService.readListPatologieTwo(this.tmp1,this.tmp2).subscribe((response) => {
                console.log("IDSintomoComponentResult2 = " + this.tmp2);
                console.log("size1 "+response.length);
                if (response != null) {
                     console.log("ci sono i risultati oggi (Yes2)!!!!");    
                     //this.router.navigateByUrl("/searchResult/"+this.tmp2);
                }
            });

            this.searchPatologiaService.readListErbeTwo(this.tmp1,this.tmp2).subscribe((response) => {   
                if (response != null) {
                    console.log("ci sono i risultati oggi (Yes or No ;D)!!");
                    //this.router.navigateByUrl("/searchResult/"+this.tmp2);
                }
            });

            this.searchPatologiaService.readListEsameTwo(this.tmp1,this.tmp2).subscribe((response) => {   
                if (response != null) {
                    this.count = 0;
                    this.router.navigateByUrl("/searchResult/"+this.tmp1+"/"+this.tmp2+"/"+this.tmp3);
                }
            });

        }
   } 
}