import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpParams, HttpClient } from "@angular/common/http";
import { Sintomo } from "src/models/Sintomo";
import { Patologia } from "src/models/Patologia";
import { Erba } from "src/models/Erba";
import { Esame } from "src/models/Esame";
import { Medico } from "src/models/Medico";


@Injectable({
    providedIn: 'root'
})
export class SearchPatologiaService{

    constructor(private http : HttpClient){}

    readListSintomi():Observable<Array<Sintomo>>{
        return this.http.get<Array<Sintomo>>("http://localhost:8080/HomeSearchSintomo/searchViewForm");
    }

    readListPatologie(idsintomo: string):Observable<Array<Patologia>>{
        console.log("IDSintomoResultService1="+idsintomo);
        return this.http.get<Array<Patologia>>("http://localhost:8080/HomeSearchSintomo/searchViewResultForm?iduser="+ idsintomo);
    }

    readListMedici(idmedico: string):Observable<Array<Medico>>{
        return this.http.get<Array<Medico>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormDoctor?idmedico="+ idmedico);
    } 

    readListErbe(iderba: string):Observable<Array<Erba>>{
        return this.http.get<Array<Erba>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormErba?iderba="+ iderba);
    }

    readListEsame(idesame: string):Observable<Array<Esame>>{
        console.log("IDEsameResultService1="+idesame);
        return this.http.get<Array<Esame>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormEsame?idesame="+ idesame);
    }

    readListErbeTwo(iderba1: string, iderba2: string):Observable<Array<Erba>>{
        return this.http.get<Array<Erba>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormTwoElemHerbs?idfirst="+ iderba1 + "&idsecond="+iderba2);
    }

    readListEsameTwo(idesame1: string, idesame2: string):Observable<Array<Esame>>{
        return this.http.get<Array<Esame>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormTwoElemExame?idfirst=" + idesame1 + "&idsecond=" + idesame2);
    }

    readListPatologieTwo(idsintomo1: string, idsintomo2: string): Observable<Array<Patologia>>{
        console.log("IDSintomo1ServiceResult= "+idsintomo1+" IDSintomo2ServiceResult= "+idsintomo2);
        return this.http.get<Array<Patologia>>("http://localhost:8080/HomeSearchSintomo/searchViewResultTwoForm?iduser1=" + idsintomo1 + "&iduser2="+idsintomo2);
    }

    readListMediciTwo(idmedico1: string, idmedico2: string):Observable<Array<Medico>>{
        return this.http.get<Array<Medico>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormTwoElemDoctor?idfirst="+ idmedico1 + "&idsecond=" + idmedico2);
    } 

    readListErbeThree(iderba1: string, iderba2: string, iderba3: string):Observable<Array<Erba>>{
        return this.http.get<Array<Erba>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormThreeElemHerbs?idfirst="+ iderba1 + "&idsecond="+iderba2 + "&idthird="+iderba3);
    }

    readListEsameThree(idesame1: string, idesame2: string, idesame3: string):Observable<Array<Esame>>{
        return this.http.get<Array<Esame>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormThreeElemExame?idfirst=" + idesame1 + "&idsecond=" + idesame2 + "&idthird="+idesame3);
    }

    readListMediciThree(idmedico1: string, idmedico2: string, idmedico3: string):Observable<Array<Medico>>{
        return this.http.get<Array<Medico>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormThreeElemDoctor?idfirst="+ idmedico1 + "&idsecond=" + idmedico2 + "&idthird="+idmedico3);
    } 

    newChoice(idsintomo: string): Observable<Array<Sintomo>>{
        console.log("IDSintomoService="+idsintomo);
        return this.http.get<Array<Sintomo>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdForm?iduser=" + idsintomo);
    }

    newChoiceTwoElement(idsintomo1: string, idsintomo2: string): Observable<Array<Sintomo>>{
        console.log("IDSintomo1Service= "+idsintomo1+" IDSintomo2Service= "+idsintomo2);
        return this.http.get<Array<Sintomo>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormTwoElem?idfirst=" + idsintomo1 + "&idsecond=" + idsintomo2);
    }

    newChoiceThreeElement(idsintomo1: string, idsintomo2: string, idsintomo3: string): Observable<Array<Patologia>>{
        console.log("IDSintomo1Service= "+idsintomo1+" IDSintomo2Service= "+idsintomo2);
        return this.http.get<Array<Patologia>>("http://localhost:8080/HomeSearchSintomo/searchViewWithIdFormThreeElem?idfirst=" + idsintomo1 + "&idsecond=" + idsintomo2 + "&idthird=" + idsintomo3);
    }

    resultTwo(idsintomo1: string, idsintomo2: string): Observable<Array<Patologia>>{
        console.log("IDSintomo1ServiceResult= "+idsintomo1+" IDSintomo2ServiceResult= "+idsintomo2);
        return this.http.get<Array<Patologia>>("http://localhost:8080/HomeSearchSintomo/searchViewResultForm?iduser1=" + idsintomo1 + "&iduser2="+idsintomo2);
    }
}