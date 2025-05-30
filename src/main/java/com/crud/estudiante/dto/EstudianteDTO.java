package com.crud.estudiante.dto;

import javax.validation.constraints.*;

public class EstudianteDTO {

	@NotBlank(message = "El nombre es obligatorio")
    @Size(max = 40, message = "Máximo 40 caracteres")
    private String nombre;

    @NotBlank(message = "El apellido es obligatorio")
    @Size(max = 40, message = "Máximo 40 caracteres")
    private String apellido;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "Formato de email inválido")
    @Size(max = 40, message = "Máximo 40 caracteres")
    private String email;

    @NotNull(message = "Los créditos son obligatorios")
    private Integer creditos;

    @NotNull(message = "El semestre es obligatorio")
    private Integer semestre;

    @NotNull(message = "El promedio es obligatorio")
    private Integer promedio;

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
