export class User{
    iduser: number;
    username: string;
    password: string;
    idRuolo: number;
    ruolo: string;
    name: string;
    surname: string;
    phone: string;
    email: string;

    constructor(iduser: number,username: string, password: string, idRuolo: number, ruolo: string, name: string, surname: string, phone: string, email: string){
        this.iduser = iduser;
        this.username = username;
        this.password = password;      
        this.idRuolo = idRuolo;
        this.ruolo = ruolo;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }
}