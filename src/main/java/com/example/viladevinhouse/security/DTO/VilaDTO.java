package com.example.viladevinhouse.security.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
public class VilaDTO {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id_vila", unique = true, nullable = true)
        private Long id;

        @Column(name = "nome_vila", unique = true, nullable = false)
        private String nomeVila;

        @Column(name = "orcamento_vila", unique = true, nullable = false)
        private Double orcamentoVila;

        @Column(name = "gasto_total", nullable = false)
        private Double gastoTotal;

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
}
