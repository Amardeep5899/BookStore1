import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookstoreService {
  
  constructor(private http:HttpClient) { }
  public  listAllBooks(): Observable<any>{
   return this.http.get("http://localhost:8082/manageBook/display");
 }
}
