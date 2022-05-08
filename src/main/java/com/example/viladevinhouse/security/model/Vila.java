package com.example.viladevinhouse.security.model;

import java.util.List;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Value;

@SuppressWarnings("serial")
@Entity
@Table(name = "vilas")
public class Vila {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_vila", unique = true, nullable = true)
	private Long id;

	@Column(name = "nome_vila", unique = true, nullable = false)
	private String nomeVila;
	
	@Column(name = "orcamento_vila", unique = true, nullable = false)
	@Value("$(vila.orcamento)")
	private Double orcamentoVila;

	@Column(name = "gasto_total", nullable = false)
	private Double gastoTotal;

	// evita recursividade quando o json de resposta for criado para a datatables.
	@JsonIgnore
	@OneToMany(mappedBy = "vila")
	private List<CadastroHabitante> cadastrosHabitantes;
	
	@JsonIgnore
	@OneToMany(mappedBy = "vila")
	private List<Relatorio> relatorios;
	
	@OneToOne(cascade = CascadeType.REMOVE)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	public Vila() {
	}

	public Vila(Long id, String nomeVila, Double orcamentoVila, Double gastoTotal, List<CadastroHabitante> cadastrosHabitantes, List<Relatorio> relatorios, Usuario usuario) {
		this.id = id;
		this.nomeVila = nomeVila;
		this.orcamentoVila = orcamentoVila;
		this.gastoTotal = gastoTotal;
		this.cadastrosHabitantes = cadastrosHabitantes;
		this.relatorios = relatorios;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeVila() {
		return nomeVila;
	}

	public void setNomeVila(String nomeVila) {
		this.nomeVila = nomeVila;
	}

	public Double getOrcamentoVila() {
		return orcamentoVila;
	}

	public void setOrcamentoVila(Double orcamentoVila) {
		this.orcamentoVila = orcamentoVila;
	}

	public Double getGastoTotal() {
		return gastoTotal;
	}

	public void setGastoTotal(Double gastoTotal) {
		this.gastoTotal = gastoTotal;
	}

	public List<CadastroHabitante> getCadastrosHabitantes() {
		return cadastrosHabitantes;
	}

	public void setCadastrosHabitantes(List<CadastroHabitante> cadastrosHabitantes) {
		this.cadastrosHabitantes = cadastrosHabitantes;
	}

	public List<Relatorio> getRelatorios() {
		return relatorios;
	}

	public void setRelatorios(List<Relatorio> relatorios) {
		this.relatorios = relatorios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
