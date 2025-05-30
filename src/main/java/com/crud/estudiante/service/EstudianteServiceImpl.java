package com.crud.estudiante.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crud.estudiante.dto.EstudianteDTO;
import com.crud.estudiante.exception.EmailDuplicadoException;
import com.crud.estudiante.model.Estudiante;
import com.crud.estudiante.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	
	private final EstudianteRepository repo;

    public EstudianteServiceImpl(EstudianteRepository repo) {
        this.repo = repo;
    }

    public List<Estudiante> listarTodos() {
        return repo.findAll();
    }

    public Optional<Estudiante> obtenerPorId(Integer id) {
    	if (!repo.existsById(id)) {
            throw new RuntimeException("Estudiante no encontrado");
        }
        return repo.findById(id);
    }

    public Estudiante guardar(EstudianteDTO estudianteDto) {
    	if (repo.existsByEmail(estudianteDto.getEmail())) {
            throw new EmailDuplicadoException("El email ya está registrado.");
        }

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(estudianteDto.getNombre());
        estudiante.setApellido(estudianteDto.getApellido());
        estudiante.setEmail(estudianteDto.getEmail());
        estudiante.setCreditos(estudianteDto.getCreditos());
        estudiante.setSemestre(estudianteDto.getSemestre());
        estudiante.setPromedio(estudianteDto.getPromedio());
        return repo.save(estudiante);
    }

    public Estudiante actualizar(Integer id, EstudianteDTO estudianteDto) {
    	Estudiante existente = repo.findById(id)
    	        .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

	    if (!existente.getEmail().equals(estudianteDto.getEmail()) &&
	    		repo.existsByEmailAndIdNot(estudianteDto.getEmail(), id)) {
	        throw new EmailDuplicadoException("El email ya está registrado por otro estudiante.");
	    }


	    existente.setNombre(estudianteDto.getNombre());
	    existente.setApellido(estudianteDto.getApellido());
	    existente.setEmail(estudianteDto.getEmail());
	    existente.setCreditos(estudianteDto.getCreditos());
	    existente.setSemestre(estudianteDto.getSemestre());
	    existente.setPromedio(estudianteDto.getPromedio());
        return repo.save(existente);
    }

    public void eliminar(Integer id) {
    	if (!repo.existsById(id)) {
            throw new RuntimeException("Estudiante no encontrado");
        }
        repo.deleteById(id);
    }
}
