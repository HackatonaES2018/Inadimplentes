import { Component } from '@angular/core';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';

import { ApiService } from './api-service.service'
import { Resposta } from 

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

  ngOnInit(){
    let test  = this.apiService.getpropostaById(1);

    console.log('Teste Aqui')
    console.log(test)
    
  }
}
