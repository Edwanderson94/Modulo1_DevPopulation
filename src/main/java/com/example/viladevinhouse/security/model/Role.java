package com.example.viladevinhouse.security.model;

import javax.persistence.*;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_role", unique = true, nullable = true)
	private Long idRole;

	@Column(name = "descricao", nullable = false, unique = true)
	private String desc;


	//@JoinColumn(name = "id_role")
	@OneToOne
	private Usuario usuario;

	public Role() {
	}

	public Role(Long idRole, String desc) {
		this.idRole = idRole;
		this.desc = desc;
	}

	public Long getIdRole() {
		return idRole;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
