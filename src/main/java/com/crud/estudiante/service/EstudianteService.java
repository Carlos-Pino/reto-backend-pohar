package com.crud.estudiante.service;

import java.util.List;
import java.util.Optional;

import com.crud.estudiante.dto.EstudianteDTO;
import com.crud.estudiante.model.Estudiante;

public interface EstudianteService {
    List<Estudiante> listarTodos();
    Optional<Estudiante> obtenerPorId(Integer id);
    Estudiante guardar(EstudianteDTO EstudianteDTO);
    Estudiante actualizar(Integer id, EstudianteDTO EstudianteDTO);
    void eliminar(Integer id);
}
