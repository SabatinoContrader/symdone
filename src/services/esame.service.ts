import { Injectable } from '@angular/core';
import { logging } from 'protractor';
import { environment } from '../environments/environment.prod';
import { tap, catchError } from 'rxjs/operators';
import {HttpClient, HttpParams} from '@angular/common/http';
import { Esame } from '../models/Esame';
import {Observable, of, BehaviorSubject} from 'rxjs';


@Injectable( )
  export class EsameService {
    feedback: string;
  
    constructor(private http: HttpClient) { }
  
    private handleError<T>(operation = 'operation', result?: T) {
      return (error: any): Observable<T> => {
        console.error(error);
        console.log('${operation} failed: ${error.message}');
        return of(result as T);
      }
    }

    insertEsame(esame: string, descrizione: string): Observable<Esame> {
        console.log("ESAME!!!!!!"+esame+" "+descrizione);
        const params = new HttpParams().set('esame', esame).set('descrizione', descrizione);
        return this.http.post<Esame>('http://localhost:8080/HomeEsame/insert', params);
    }
    readEsame():Observable<Array<Esame>>{
        return this.http.get<Array<Esame>>("http://localhost:8080/HomeEsame/ShowEsame")
    }
    updateEsame(idesame: string, esame: string, descrizione: string): Observable<Esame>{
    const params = new HttpParams().set('idesame', idesame).set('esame', esame).set('descrizione', descrizione);
    return this.http.post<Esame>('http://localhost:8080/HomeEsame/updateEsame', params);
    }
    deleteEsame(idesame: string):Observable<boolean>{
        console.log("sono arrivato"+idesame);
    
    return this.http.get<boolean>('http://localhost:8080/HomeEsame/deleteEsame?idesame='+idesame);
    }
}
