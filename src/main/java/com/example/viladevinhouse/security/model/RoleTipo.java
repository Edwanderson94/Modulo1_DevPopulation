package com.example.viladevinhouse.security.model;

public enum RoleTipo {
	ADMIN(1, "ADMIN"), VILA(2, "VILA"), HABITANTE(3, "HABITANTE");
	
	private long cod;
	private String desc;

	private RoleTipo(long cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public long getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}
}