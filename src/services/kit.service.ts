import { HttpClient, HttpParams } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable ,of} from "rxjs";
import { Kit } from "src/models/Kit";

@Injectable({
    providedIn: 'root'
})

export class KitService{

    constructor (private http:HttpClient){ }
   
    private handleError<T>(operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {
          console.error(error);
          console.log('${operation} failed: ${error.message}');
          return of(result as T);
        };
    }

    readKit():Observable <Array<Kit>> {
        return this.http.get<Array<Kit>> ("http://localhost:8080/HomeKit/ShowKit")
    }
    newKit(tipoKit: string, descrizioneKit:string, software:string): Observable<Kit>{
        const params = new HttpParams().set('tipoKit', tipoKit).set('descrizioneKit', descrizioneKit).set('software', software);
        return this.http.post<Kit>("http://localhost:8080/HomeKit/insertKit", params)
    }
    delete(idkit:string): Observable<boolean> {
        return this.http.get<boolean>("http://localhost:8080/HomeKit/deleteKit?idkit="+idkit);
    }
    update(idkit:string, tipoKit:string, descrizioneKit:string, software:string):Observable<Kit>{
        const params = new HttpParams().set("idkit",idkit).set("tipoKit",tipoKit).set("descrizioneKit", descrizioneKit).set("software", software);
      return this.http.post<Kit>("http://localhost:8080/HomeKit/updateKit", params)
    }

}