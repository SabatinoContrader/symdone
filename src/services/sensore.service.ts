import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable, of, BehaviorSubject} from 'rxjs';
import { HttpHeaders, HttpParams } from '@angular/common/http';
import{Sensore } from"../models/Sensore";

@Injectable()

export class SensoreService{
    
    
    constructor(private http: HttpClient) { }

    private handleError<T>(operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {
          console.error(error);
          console.log('${operation} failed: ${error.message}');
          return of(result as T);
        }
    }
        insertSensore(tipoSensore: string, specificheSensore: string,): Observable<Sensore> {
            const params = new HttpParams().set('tipoSensore', tipoSensore).set('specificheSensore', specificheSensore);
            console.log(tipoSensore+" "+specificheSensore);
            return this.http.post<Sensore>('http://localhost:8080/HomeSensore/insertSensore', params);
        }
        readSensore():Observable<Array<Sensore>>{
            return this.http.get<Array<Sensore>>("http://localhost:8080/HomeSensore/showSensore")
        }
        updateSensore(idsensore: string, tipoSensore: string, specificheSensore: string,): Observable<Sensore>{
        const params = new HttpParams().set('idsensore',idsensore).set('tipoSensore', tipoSensore).set('specificheSensore', specificheSensore);
        return this.http.post<Sensore>('http://localhost:8080/HomeSensore/updateSensore', params);
        }
        deleteSensore(idsensore: string):Observable<boolean>{
            console.log("sono arrivato"+idsensore);
        const params =new HttpParams().set("idsensore",idsensore);
        return this.http.post<boolean>('http://localhost:8080/HomeSensore/deleteSensore', params);

        }
}  


