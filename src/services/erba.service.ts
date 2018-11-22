import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable, of, BehaviorSubject} from 'rxjs';
import { HttpHeaders, HttpParams } from '@angular/common/http';
import{Erba } from"../models/Erba";
import { User } from '../models/User';
import { tap, catchError } from 'rxjs/operators';
@Injectable()

export class ErbaService{
    
    
    constructor(private http: HttpClient) { }

    private handleError<T>(operation = 'operation', result?: T) {
        return (error: any): Observable<T> => {
          console.error(error);
          console.log('${operation} failed: ${error.message}');
          return of(result as T);
        }
    }
        insertErba(erba: string, descrizione: string,): Observable<Erba> {
            const params = new HttpParams().set('erba', erba).set('descrizione', descrizione);
            console.log(erba+" "+descrizione);
            return this.http.post<Erba>('http://localhost:8080/HomeErbaC/insertErba', params);
        }
        readErba():Observable<Array<Erba>>{
            return this.http.get<Array<Erba>>("http://localhost:8080/HomeErbaC/ShowErba")
        }
        updateErba(iderba: string, erba: string, descrizione: string,): Observable<Erba>{
        const params = new HttpParams().set('iderba',iderba).set('erba', erba).set('descrizione', descrizione);
        return this.http.post<Erba>('http://localhost:8080/HomeErbaC/updateErba', params);
        }
        deleteErba(iderba: string):Observable<boolean>{
            console.log("sono arrivato"+iderba);
        const params =new HttpParams().set("iderba",iderba);
        return this.http.post<boolean>('http://localhost:8080/HomeErbaC/deleteErba', params);

        }
}  


