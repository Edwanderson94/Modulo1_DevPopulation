package com.example.viladevinhouse.security.model;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "relatorios")
public class Relatorio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_relatorio", unique = true, nullable = true)
	private Long idRelatorio;

	@ManyToOne
	@JoinColumn(name="id_vila")
	private Vila vila;

	public Vila getVila() {
		return vila;
	}

	public void setVila(Vila vila) {
		this.vila = vila;
	}

}
