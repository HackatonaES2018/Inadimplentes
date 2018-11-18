import {Injectable} from '@angular/core'
import {HttpClient, HttpHeaders} from '@angular/common/http'
import {Cliente, Contrato} from './app.interfaces'

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(
    private http: HttpClient
  ){}

  async getpropostaById(id: number): Promise<Cliente> {
    console.log('No Api Service');
    
    const headers: HttpHeaders = new HttpHeaders({
        'client_id': 'ef377796-a530-31aa-b9f0-2cb1d34c90a0'
    })

    const response: Cliente = await 
        this.http.get<Cliente>(`https://sb-api.portocred.com.br/credito-pessoal-demo/v1/propostas/${id}`, {headers: headers}).toPromise()

    return response
  }

  async getcontratosByCpf(cpf: string): Promise<Contrato> {
    console.log('No Api Service');
    
    const headers: HttpHeaders = new HttpHeaders({
        'client_id': 'ef377796-a530-31aa-b9f0-2cb1d34c90a0'
    })

    const response: Contrato = await 
        this.http.get<Contrato>(`https://sb-api.portocred.com.br/credito-pessoal-demo/v1/clientes/${cpf}/contratos`, {headers: headers}).toPromise()

    return response
  }

  async messageWpp(): Promise<any> {
    const token = 'eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJhdWQiOiJoZXJtZXNhcGkiLCJleHAiOjE1NDQ5MTQ0OTksImlhdCI6MTU0MjQ5NTI5OSwiaXNzIjoiaGVybWVzYXBpIiwianRpIjoiYmJjMDE4NDAtNmI3Yy00ZmU1LWI2OTEtOGU1MWE1OGQ2NWEzIiwibmJmIjoxNTQyNDk1Mjk4LCJzdWIiOiIxZjE2MjNkNy1mNGVjLTQwNDgtYmUxYS0xNzY3MjgxMTdlMzciLCJ0eXAiOiJhY2Nlc3MifQ.MoyAgHV_zRK3zGbsOL0WKDtoCbKP2W6pVNk_6CTpmCp9NtqBaBaqx7hxiTbVHkiSKhkk_2nOg7sfKudO0mM9Bg'
    const headers: HttpHeaders = new HttpHeaders({
      'Authorization': `Bearer ${token}`,
      'Content-Type': 'application/json'
    })
    await this.http.post<any>('https://api.h3rmes.com/api/v1/messages',{
      message: {
        media_id: "a2652889-89e5-4200-aac0-f05a6a2de828", 
        text: "Oi eu sou o Goku", 
        to: "+5551993412269", 
        type: "text" 
      }, 
    }, {headers: headers}).toPromise()
  }

  // async enviarWpp(): Promise<Contrato> {
  //   console.log('No Api Service');

    
  //   const headers: HttpHeaders = new HttpHeaders({
  //     'media_id': 'a2652889-89e5-4200-aac0-f05a6a2de828', 
  //     'text': 'Oi', 
  //     'to': '+555199677239', 
  //     'type': "text"
  //   })

  //   const response: Contrato = await 
  //       this.http.post<Contrato>(`https://api.h3rmes.com/api/v1/messages`, {headers: headers}).toPromise()

  //   return response
  // }
}
