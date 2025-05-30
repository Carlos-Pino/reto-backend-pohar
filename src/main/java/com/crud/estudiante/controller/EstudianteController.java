package com.crud.estudiante.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.estudiante.dto.EstudianteDTO;
import com.crud.estudiante.model.Estudiante;
import com.crud.estudiante.service.EstudianteService;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

	private final EstudianteService service;
	
	public EstudianteController(EstudianteService service) {
        this.service = service;
    }
	
	@GetMapping
    public List<Estudiante> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> obtenerPorId(@PathVariable Integer id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estudiante crear(@RequestBody @Valid EstudianteDTO estudianteDto) {
        return service.guardar(estudianteDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable Integer id, @RequestBody @Valid EstudianteDTO estudianteDto) {
        return ResponseEntity.ok(service.actualizar(id, estudianteDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        return service.obtenerPorId(id)
                .map(e -> {
                    service.eliminar(id);
                    return ResponseEntity.ok("Estudiante con ID " + id + " eliminado correctamente.");
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
