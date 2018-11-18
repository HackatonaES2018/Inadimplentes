import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api-service.service'
import { Cliente, Contrato} from '../app.interfaces';
import { MatDialog } from '@angular/material';
import { CompartilharPortocoinsComponent } from '../compartilhar-portocoins/compartilhar-portocoins.component';

@Component({
  selector: 'app-tab-portocoins',
  templateUrl: './tab-portocoins.component.html',
  styleUrls: ['./tab-portocoins.component.css']
})
export class TabPortocoinsComponent implements OnInit {
  nomeCliente: string;

  constructor(
    private apiService: ApiService,
    public dialog: MatDialog
  ) { }

  openDialogCompartilhar(): void {
    const dialogRef = this.dialog.open(CompartilharPortocoinsComponent, {
      width: '450px',
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
    });
  }

  async ngOnInit() {
    const temp: any = await this.apiService.getpropostaById(1);
    console.log('Resposta do Get Proposal');
    console.log(temp);

    const test: Cliente = temp.cliente;
    console.log(test);
    const contrato: Contrato = await this.apiService.getcontratosByCpf(test.cpf);
    await this.apiService.messageWpp();

    console.log('Teste Aqui');
    console.log(test.nome);
    this.nomeCliente = test.nome;
  }

}
