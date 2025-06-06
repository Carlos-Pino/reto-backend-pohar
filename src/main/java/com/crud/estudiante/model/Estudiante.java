package com.crud.estudiante.model;

import javax.persistence.*;

@Entity
@Table(name = "estudiantes", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 40)
    private String nombre;

    @Column(nullable = false, length = 40)
    private String apellido;

    @Column(nullable = false, length = 40, unique = true)
    private String email;

    @Column(nullable = false)
    private Integer creditos;

    @Column(nullable = false)
    private Integer semestre;

    @Column(nullable = false)
    private Integer promedio;

    // Getters y Setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public Integer getPromedio() {
		return promedio;
	}

	public void setPromedio(Integer promedio) {
		this.promedio = promedio;
	}
}