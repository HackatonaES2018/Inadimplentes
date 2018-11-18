import { Component } from '@angular/core';

interface Cliente {
    nome: string,
    cpf: string
}

export{Cliente}

interface Contrato{
    parcela: Parcela[],
    cliente: String
}
export{Contrato}

interface Parcela{
    situacao_parcela: string,
    renda : number
}
export{Parcela}