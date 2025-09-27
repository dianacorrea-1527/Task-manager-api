package com.gestiontareas.to_do_app_backend.repositories;
import com.gestiontareas.to_do_app_backend.entities.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea,Long> {
}
