import { Injectable } from '@angular/core';
import { logging } from 'protractor';
import { environment } from '../environments/environment.prod';
import { tap, catchError } from 'rxjs/operators';
import {HttpClient, HttpParams} from '@angular/common/http';
import { User } from "src/models/User";
import {Observable, of, BehaviorSubject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
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

  login(username: string, password: string): Observable <User> {
    const params = new HttpParams().set('username', username).set('password', password);
    return this.http.post<User>('http://localhost:8080/Login/loginControl',params)
    .pipe(tap((response) => console.log("Utente"), catchError(this.handleError("login error", {})))
    );
  }

  signup(username:string, password:string, 
    ruolo:string, name:string, surname:string, phone:string, email:string): Observable<User>{
      if(ruolo == "admin" || ruolo == "Admin"){
        console.log("sei entrato qui??"+ username);
        const params = new HttpParams().set('iduser', '0').set('username', username).set('password', password).set('ruolo', ruolo).set('idRuolo', '1').
        set('name', name).set('surname', surname).set('phone',phone).set('email', email);
        return this.http.post<User>('http://localhost:8080/Login/register', params);
      }
      else if(ruolo == "doctor" || ruolo == "Doctor"){
        console.log("sei entrato qui??"+ username);
        const params = new HttpParams().set('iduser', '0').set('username', username).set('password', password).set('ruolo', ruolo).set('idRuolo', '2').
        set('name', name).set('surname', surname).set('phone',phone).set('email', email);
        return this.http.post<User>('http://localhost:8080/Login/register', params);
      }
      else if(ruolo == "patient" || ruolo == "Patient"){
        console.log("sei entrato qui??"+ username);
        const params = new HttpParams().set('iduser', '0').set('username', username).set('password', password).set('ruolo', ruolo).set('idRuolo', '3').
        set('name', name).set('surname', surname).set('phone',phone).set('email', email);
        return this.http.post<User>('http://localhost:8080/Login/register', params);
      }     

  }


  changeFeedback(message: string){
    this.feedback = message;
  }

  deleteFeedback(){
    this.feedback = "";
  }
}




