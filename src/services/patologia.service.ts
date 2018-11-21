import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpParams, HttpClient } from "@angular/common/http";
import { Patologia } from "src/models/Patologia";


@Injectable({
    providedIn: 'root'
})
export class PatologiaService{

    constructor(private http : HttpClient){}

    readPatologia():Observable<Array<Patologia>>{
        return this.http.get<Array<Patologia>>("http://localhost:8080/HomePatologia/ShowPatologia");
    }
    newPatologia(patologia:string, descrizione:string):Observable<Patologia>{
        const params = new HttpParams().set("patologia",patologia).set("descrizione",descrizione);
        console.log("patologia1!! ="+patologia + "descrizione1!! =" + descrizione);
        return this.http.post<Patologia>("http://localhost:8080/HomePatologia/InsertPatologia", params)
    }
    delete(idpatologia:string):Observable<boolean>{

        return this.http.get<boolean>("http://localhost:8080/HomePatologia/delete?idpatologia="+idpatologia)
    }
    update(idpatologia:string ,patologia:string, descrizione:string):Observable<Patologia>{
        const params = new HttpParams().set("idpatologia",idpatologia).set("patologia",patologia).set("descrizione",descrizione);
        return this.http.post<Patologia>("http://localhost:8080/HomePatologia/update", params)
    }

}