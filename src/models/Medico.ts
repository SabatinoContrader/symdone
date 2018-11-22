export class Medico{
    idmedico: number;
    nome: string;
    cognome: string;
    indirizzo: string;
    mail: string;
    specializzazione: string;

    constructor(idmedico: number, nome: string, cognome: string, indirizzo: string, mail: string, specializzazione: string){
        this.idmedico = idmedico;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.mail = mail;
        this.specializzazione = specializzazione;
    }
}