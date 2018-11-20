export class Patologia {
idpatologia: number;
patologia: string;
descrizione: string;
constructor(idpatologia: number, patologia: string, descrizione: string){
    this.idpatologia = idpatologia;
    this.patologia = patologia;
    this.descrizione = descrizione;
}

}