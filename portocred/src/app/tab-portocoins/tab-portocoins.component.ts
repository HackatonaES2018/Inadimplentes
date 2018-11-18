import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api-service.service'
import { Cliente, Contrato} from '../app.interfaces';

@Component({
  selector: 'app-tab-portocoins',
  templateUrl: './tab-portocoins.component.html',
  styleUrls: ['./tab-portocoins.component.css']
})
export class TabPortocoinsComponent implements OnInit {
  nomeCliente: string;

  constructor(
    private apiService: ApiService
  ){}

  async ngOnInit(){
    
    let temp: any = await this.apiService.getpropostaById(1);
    console.log('Resposta do Get Proposal');
    console.log(temp);

    let test: Cliente = temp.cliente
    console.log(test);
    
    let contrato:Contrato = await this.apiService.getcontratosByCpf(test.cpf);
    await this.apiService.messageWpp();

    console.log('Teste Aqui')
    console.log(test.nome)
    this.nomeCliente = test.nome;
    
  }

}
