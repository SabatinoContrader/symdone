export class User{
    username: string;
    password: string;
    iduser: number;
    idRuolo: number;
    ruolo: string;
    //surname: string;
    //address: string;
    //cap: number;
    //handiccaped: string;
    //phone: string;
    //email: string;

    constructor(username: string, password: string, iduser: number, idRuolo: number, ruolo: string){
        this.username = username;
        this.password = password;
        this.iduser = iduser;
        this.idRuolo = idRuolo;
        this.ruolo = ruolo;
        //this.surname = surname;
        //this.address = address;
        //this.cap = cap;
        //this.handiccaped = handiccaped;
        //this.phone = phone;
        //this.email = email;
    }


}