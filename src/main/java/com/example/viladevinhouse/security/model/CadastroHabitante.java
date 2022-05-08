package com.example.viladevinhouse.security.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
@Table(name = "cadastros_habitantes")
public class CadastroHabitante {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "id_cdhabitante", nullable = false, unique = true)
	private Long id;

	@ManyToOne
	@JoinColumn(name="id_vila")
	private Vila vila;
	
	@ManyToOne
	@JoinColumn(name="id_habitante")
	private Habitante habitante;
/*
	@ManyToOne
	@JoinColumn(name="id_renda")
	private Renda renda;
*/
	@Column(name="variavel_eliminar")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate variavelEliminar;

	public Vila getVila() {
		return vila;
	}

	public void setVila(Vila vila) {
		this.vila = vila;
	}

	public Habitante getPaciente() {
		return habitante;
	}

	public void setPaciente(Habitante habitante) {
		this.habitante = habitante;
	}

	public LocalDate getVariavelEliminar() {
		return variavelEliminar;
	}

	public void setVariavelEliminar(LocalDate variavelEliminar) {
		this.variavelEliminar = variavelEliminar;
	}

//	public Renda getRenda() {
//		return renda;
//	}
//
//	public void setRenda(Renda renda) {
//		this.renda = renda;
//	}
}
