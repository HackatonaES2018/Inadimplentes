import {Injectable} from '@angular/core'
import {HttpClient, HttpHeaders} from '@angular/common/http'
// import 'rxjs/add/operator/toPromise'

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(
    private http: HttpClient
  ){}

  async getpropostaById(id: number): Promise<Resposta> {
    console.log('No Api Service');
    
    const headers: HttpHeaders = new HttpHeaders({
        'client_id': 'ef377796-a530-31aa-b9f0-2cb1d34c90a0'
    })

    const response: Resposta = await 
        this.http.get<Resposta>(`https://sb-api.portocred.com.br/credito-pessoal-demo/v1/propostas/${id}`, {headers: headers}).toPromise()

    return response
  }
}
