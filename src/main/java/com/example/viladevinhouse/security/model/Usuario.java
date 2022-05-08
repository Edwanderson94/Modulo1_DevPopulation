package com.example.viladevinhouse.security.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@SuppressWarnings("serial")
@Getter
@Setter
@Entity
@Table(name = "usuarios", indexes = {@Index(name = "idx_usuario_email", columnList = "email")})
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_usuario", unique = true, nullable = true)
	private Long idUsuario;

	@Column(name = "email", unique = true, nullable = false)
	private String emailUsuario;
	
	@JsonIgnore
	@Column(name = "senha", nullable = false)
	private String senha;

	/*@JoinTable(
		name = "usuarios_tem_roles", 
        joinColumns = { @JoinColumn(name = "usuario_id", referencedColumnName = "id") }, 
        inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") }
	)*/

	@OneToOne(mappedBy = "usuario")
	private Role role;
	
	@Column(name = "ativo", nullable = false, columnDefinition = "INTEGER")
	private boolean ativo;
	
	@Column(name = "codigo_verificador", length = 6)
	private String codigoVerificador;

	public Usuario() {
	}

	public Usuario(Long idUsuario, String emailUsuario, String senha, Role role, boolean ativo, String codigoVerificador) {
		this.idUsuario = idUsuario;
		this.emailUsuario = emailUsuario;
		this.senha = senha;
		this.role = role;
		this.ativo = ativo;
		this.codigoVerificador = codigoVerificador;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getCodigoVerificador() {
		return codigoVerificador;
	}

	public void setCodigoVerificador(String codigoVerificador) {
		this.codigoVerificador = codigoVerificador;
	}
}
