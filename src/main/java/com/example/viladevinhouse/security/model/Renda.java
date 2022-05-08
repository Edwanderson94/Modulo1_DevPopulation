package com.example.viladevinhouse.security.model;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "rendas", indexes = {@Index(name = "idx_valor", columnList = "valor")})
public class Renda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_renda", unique = true, nullable = true)
	private Long idRenda;
	
	@Column(name = "valor", unique = true, nullable = false)
	private Double valor;

	public Double getvalor() {
		return valor;
	}

	public void setvalor(Double valor) {
		this.valor = valor;
	}
}
