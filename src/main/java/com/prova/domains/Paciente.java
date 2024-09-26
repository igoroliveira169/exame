package com.prova.domains;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_paciente")
    private int id;

    @NotNull @NotBlank
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

    @NotNull
    @Digits(integer = 15, fraction = 3)
    private BigDecimal custoInternacao;

    public Paciente(){}

    public Paciente(int id, String nome, LocalDate dataNascimento, BigDecimal custoInternacao) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.custoInternacao = custoInternacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getCustoInternacao() {
        return custoInternacao;
    }

    public void setCustoInternacao(BigDecimal custoInternacao) {
        this.custoInternacao = custoInternacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return id == paciente.id && Objects.equals(nome, paciente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
