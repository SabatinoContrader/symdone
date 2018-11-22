import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { HttpParams, HttpClient } from "@angular/common/http";
import { DatiBiomedici } from "src/models/DatiBiomedici";
import { Data } from "@angular/router";


@Injectable({
    providedIn: 'root'
})
export class DatiBiomediciService{

    constructor(private http : HttpClient){}

    readDatiBiomedici():Observable<Array<DatiBiomedici>>{
        return this.http.get<Array<DatiBiomedici>>("http://localhost:8080/HomeDatiBiomedici/ShowDatiBiomedici");
    }
    newDatiBiomedici(risultato:string, data:string):Observable<DatiBiomedici>{
        const params = new HttpParams().set("risultato",risultato).set("data",data);
        return this.http.post<DatiBiomedici>("http://localhost:8080/HomeDatiBiomedici/InsertDatiBiomedici", params);
    }
    delete(idcartella:string):Observable<boolean>{

        return this.http.get<boolean>("http://localhost:8080/HomeDatiBiomedici/delete?idcartella="+idcartella)
    }
    update(idcartella:string ,risultato:string, data:string):Observable<DatiBiomedici>{
        const params = new HttpParams().set("idcartella",idcartella).set("risultato",risultato).set("data",data);
        return this.http.post<DatiBiomedici>("http://localhost:8080/HomeDatiBiomedici/update", params)
    }
}