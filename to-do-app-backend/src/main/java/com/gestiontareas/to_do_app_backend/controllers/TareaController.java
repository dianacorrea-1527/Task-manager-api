package com.gestiontareas.to_do_app_backend.controllers;

import com.gestiontareas.to_do_app_backend.entities.Tarea;
import com.gestiontareas.to_do_app_backend.services.TareaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //manejar los datos en formato JSON
@RequestMapping("/api/tareas")

public class TareaController {
@Autowired
    private TareaService tareaService;
@GetMapping
    public List<Tarea> ListarTareas(){
    return tareaService.getAllTareas();

}
@GetMapping("/{id}")
public ResponseEntity<Tarea>ListarTareaPorId(@PathVariable long id){
    Optional<Tarea> tarea = tareaService.getTareaById(id);
    return tarea.map (value -> ResponseEntity.ok().body(value)).orElse((null));


}
@PostMapping
public ResponseEntity<Tarea>guardarTarea(@RequestBody Tarea tarea){
    Tarea tareaGuardada = tareaService.createTarea(tarea);
    return ResponseEntity.status(HttpStatus.CREATED).body(tareaGuardada);

}
@PutMapping("/{id}")
public ResponseEntity<Tarea>actualizarTarea(@PathVariable Long id,@RequestBody Tarea tarea){
    Tarea tareaUpdate = tareaService.updateTarea(id,tarea);
    if(tareaUpdate!=null){
        return ResponseEntity.ok().body(tareaUpdate);
    }
    else{
        return ResponseEntity.notFound().build();
    }

}
@DeleteMapping("/{id}")
public ResponseEntity<Void>eliminarTarea(@PathVariable Long id){
    tareaService.deleteTarea(id);
    return ResponseEntity.noContent().build();

}

}
