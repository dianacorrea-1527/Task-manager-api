import { Component } from '@angular/core';
import { TareaService } from '../../services/tarea.service';
import { Tarea } from '../../models/tarea';
import { NgFor } from '@angular/common';
import { RouterLink } from '@angular/router'
@Component({
  selector: 'app-tarea-list',
  imports: [NgFor, RouterLink],
  templateUrl: './tarea-list.component.html',
  styleUrl: './tarea-list.component.css'
})
export class TareaListComponent {

  tareas?:Tarea[];
  constructor(private tareaService:TareaService){}

  ngOnInit():void{
    this.cargarTareas();

  }//metodo que permite cargar despues de las propiedades del componente

  //metodo cargar tareas

  cargarTareas():void{
    this.tareaService.getAllTareas().subscribe(tareas => {
      this.tareas = tareas;
    })
  }
  eliminarTareas(id?:number):void{
    this.tareaService.deleteTarea(id!).subscribe(() => {
    this.cargarTareas(); 
    })
  }

}
