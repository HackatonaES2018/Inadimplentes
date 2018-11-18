import { Component } from '@angular/core';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';

import { ApiService } from './api-service.service'
import { Cliente, Contrato } from './app.interfaces' 

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'portocred';

  constructor(
    private apiService: ApiService
  ){}

  async ngOnInit(){
    
    let temp: any = await this.apiService.getpropostaById(1);
    console.log('Resposta do Get Proposal');
    console.log(temp);

    let test: Cliente = temp
    console.log(test);
    
    let contrato:Contrato = await this.apiService.getcontratosByCpf(test.cpf);
    await this.apiService.messageWpp();

    console.log('Teste Aqui')
    console.log(test.nome)
    
  }
}
