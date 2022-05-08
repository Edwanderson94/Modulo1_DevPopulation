package com.example.viladevinhouse.security.DTO;

public class HabitanteResponseDTO {
    private  long id;
    private  String nome;

    public HabitanteResponseDTO(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
