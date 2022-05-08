package com.example.viladevinhouse.security.DTO;

import com.example.viladevinhouse.security.model.Habitante;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
public class HabitantesDTO {

    @Id
    @Column (name = "id_habitante", nullable = false, unique = true)
    private Long id;

    @Column(name = "nmHabitante", nullable = false)
    private String nomeHabitante;

    @Column(name= "sobrenomeHabitante", nullable = false)
    private String sobrenomeHabitante;

    @Column(name = "dtNascimento", nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private  LocalDate dtNascHabitante;

    @Column(name = "rendaHabitante", nullable = false)
    private Double rendaHabitante;

    @CPF
    @Column (nullable = false, length = 11)
    private String cpf;

    @Column (nullable = false, unique = true)
    private Long id_vila;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeHabitante() {
        return nomeHabitante;
    }

    public void setNomeHabitante(String nomeHabitante) {
        this.nomeHabitante = nomeHabitante;
    }

    public String getSobrenomeHabitante() {
        return sobrenomeHabitante;
    }

    public void setSobrenomeHabitante(String sobrenomeHabitante) {
        this.sobrenomeHabitante = sobrenomeHabitante;
    }

    public LocalDate getDtNascHabitante() {
        return dtNascHabitante;
    }

    public void setDtNascHabitante(LocalDate dtNascHabitante) {
        this.dtNascHabitante = dtNascHabitante;
    }

    public Double getRendaHabitante() {
        return rendaHabitante;
    }

    public void setRendaHabitante(Double rendaHabitante) {
        this.rendaHabitante = rendaHabitante;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getId_vila() {
        return id_vila;
    }

    public void setId_vila(Long id_vila) {
        this.id_vila = id_vila;
    }
}

