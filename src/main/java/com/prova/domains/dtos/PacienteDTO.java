package com.prova.domains.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.prova.domains.Paciente;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class PacienteDTO {
    private int id;

    @NotNull(message = "O campo nome não pode ser nulo!")
    @NotBlank(message = "O campo nome não pode estar vazio!")
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento = LocalDate.now();

    @NotNull(message = "O campo custo internação não pode ser nulo!")
    @NotBlank(message = "O campo nome não pode estar vazio!")
    @Digits(integer = 15, fraction = 3)
    private BigDecimal custoInternacao;

    public PacienteDTO(Paciente obj) {
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

    public @NotNull(message = "O campo nome não pode ser nulo!") @NotBlank(message = "O campo nome não pode estar vazio!") String getNome() {
        return nome;
    }

    public void setNome(@NotNull(message = "O campo nome não pode ser nulo!") @NotBlank(message = "O campo nome não pode estar vazio!") String nome) {
        this.nome = nome;
    }

    public LocalDate dataNascimento() {
        return dataNascimento;
    }

    public void dataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull(message = "O campo custo internação não pode ser nulo!") @NotBlank(message = "O campo nome não pode estar vazio!") @Digits(integer = 15, fraction = 3) BigDecimal getCustoInternacao() {
        return custoInternacao;
    }

    public void setCustoInternacao(@NotNull(message = "O campo custo internação não pode ser nulo!") @NotBlank(message = "O campo nome não pode estar vazio!") @Digits(integer = 15, fraction = 3) BigDecimal custoInternacao) {
        this.custoInternacao = custoInternacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PacienteDTO that = (PacienteDTO) o;
        return Objects.equals(dataNascimento, that.dataNascimento) && Objects.equals(custoInternacao, that.custoInternacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataNascimento, custoInternacao);
    }
}
