import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TareaService {

  private baseUrl='http://localhost:8080/api/tareas';//crear variable para url de la api
  constructor(private http:HttpClient) { } //llamamos a un cliente http, eta clase permite comunicarnos con una api externa
  //metodos
  getAllTareas(): Observable<Tarea[]>{
    return this.http.get<Tarea[]>(this.baseUrl);
  }
  getTareaById(id:number):Observable<Tarea>{
    return this.http.get<Tarea[]>(`${this.baseUrl}/${id}`)
  }

  createTarea(tarea:Tarea):Observable<Tarea>{
    return this.http.post<Tarea>(this.baseUrl,tarea);

  }

  updateTarea(id:number,tarea:Tarea):Observable<Tarea>{
    return this.http.put<Tarea>(`${this.baseUrl}/${id}`,tarea);

  }

  deleteTarea(id:number):Observable<void>{
    return this.http.delete<void>(`${this.baseUrl}/${id}`);
  }
}
