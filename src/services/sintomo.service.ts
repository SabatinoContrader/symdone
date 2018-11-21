
import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable ,of} from "rxjs";
import { Sintomo } from "src/models/Sintomo";

@Injectable({
    providedIn: 'root'
})

export class SintomoService{

    constructor (private http:HttpClient){ }
   
    private handleError<T>(operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {
          console.error(error);
          console.log('${operation} failed: ${error.message}');
          return of(result as T);
        };
    }

    readSintomo():Observable <Array<Sintomo>> {
        return this.http.get<Array<Sintomo>> ("http://localhost:8080/HomeSintomo/ShowSintomo")
    }
    newSintomo(nomeSintomo: string): Observable<Sintomo>{
        const params = new HttpParams().set('nomeSintomo', nomeSintomo);
        console.log("nomeSintomo="+nomeSintomo);
        return this.http.post<Sintomo>("http://localhost:8080/HomeSintomo/insertSintomo", params)
    }
    delete(id:string): Observable<boolean> {
        return this.http.get<boolean>("http://localhost:8080/HomeSintomo/delete?id="+id);
    }
    update(idsintomo:string, nomeSintomo:string):Observable<Sintomo>{
        const params = new HttpParams().set("id",idsintomo).set("nomeSintomo",nomeSintomo);
        console.log(idsintomo);
        return this.http.post<Sintomo>("http://localhost:8080/HomeSintomo/update", params)
    }

}