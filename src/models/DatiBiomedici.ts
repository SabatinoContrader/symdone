export class DatiBiomedici {
    idcartella: string;
    idpaziente: string;
    idmedico: string;
    idsensore: string;
    risultato: Blob;
    data: Date;
    
    constructor(idcartella: string,idpaziente: string,  idmedico: string, idsensore: string, risultato: Blob, data: Date ){
        this.idcartella = idcartella;
        this.idpaziente = idpaziente;
        this.idmedico = idmedico;
        this.idsensore= idsensore;
        this.risultato=risultato;
        this.data=data
    }
    
    }