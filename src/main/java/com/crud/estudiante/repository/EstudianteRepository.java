package com.crud.estudiante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.estudiante.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
	boolean existsByEmail(String email);
	boolean existsByEmailAndIdNot(String email, Integer id);
}
