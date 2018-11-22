import { Injectable } from "@angular/core";
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable, of, BehaviorSubject} from 'rxjs';
import { User } from "../models/User";
import { Medico } from "../models/Medico";
import { tap, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class MedicoService {
  feedback: string;

  constructor(private http: HttpClient) { }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.log(result);
      console.error(error);
      console.log('${operation} failed: ${error.message}');
      return of(result as T);
    };
  }

  findAll():Observable<Array<Medico>>{
    return this.http.get<Array<Medico>>('http://localhost:8080/HomeMedico/ShowMedico');
  }

  readOne(idmedico:string): Observable<Medico>{
    return this.http.get<Medico>('http://localhost:8080/HomeMedico/updateForm?id='+idmedico);
  }

  update(idmed:string, nomeMedico:string, cognomeMedico:string, specializzazioneMedico:string, indirizzoMedico:string, mailMedico:string):Observable<Medico>{
    const params = new HttpParams().set("idMedico", idmed).set("nomeMedico", nomeMedico).set("cognomeMedico", cognomeMedico).set("specializzazioneMedico",specializzazioneMedico).set("indirizzoMedico",indirizzoMedico).set("mailMedico",mailMedico);
    console.log(idmed);
    return this.http.post<Medico>("http://localhost:8080/HomeMedico/updateMedico", params)
  }

  delete(id: String): Observable<boolean>{
    return this.http.get<boolean>('http://localhost:8080/HomeMedico/deleteMedico?id='+id);
  }

  newMedico(nomeMedico:string, cognomeMedico:string, specializzazioneMedico:string, indirizzoMedico:string, mailMedico:string): Observable<Medico>{
    const params = new HttpParams().set("nomeMedico", nomeMedico).set("cognomeMedico", cognomeMedico).set("specializzazioneMedico",specializzazioneMedico).set("indirizzoMedico",indirizzoMedico).set("mailMedico",mailMedico);
    return this.http.post<Medico>('http://localhost:8080/HomeMedico/insertMedico', params)
  }

  /*changeFeedback(message: string){
    this.feedback = message;
  }*/

  deleteFeedback(){
    this.feedback = "";
  }

}
