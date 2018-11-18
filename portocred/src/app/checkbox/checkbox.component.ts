import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api-service.service';
import { Parcela, Contrato, Cliente} from '../app.interfaces';

@Component({
  selector: 'app-checkbox',
  templateUrl: './checkbox.component.html',
  styleUrls: ['./checkbox.component.css']
})
export class CheckboxComponent implements OnInit {
  parcela: Parcela;
  rendaParcela1: number;
  rendaParcela2: number;

  constructor(
    private apiService: ApiService
  ) {
  }

  async ngOnInit(){
    const temp: any = await this.apiService.getpropostaById(1);
    console.log('Resposta do Get Proposal');
    console.log(temp);

    const test: Cliente = temp.cliente;
    console.log(test);
    const contrato: any = await this.apiService.getcontratosByCpf(test.cpf);
    await this.apiService.messageWpp();

    const toParcela1: Parcela = contrato.parcela[0];
    const toParcela2: Parcela = contrato.parcela[1];
    this.rendaParcela1 = toParcela1.renda;
    this.rendaParcela2 = toParcela2.renda;

    console.log('Teste Aqui');
    console.log(this.rendaParcela1);
  }

}
