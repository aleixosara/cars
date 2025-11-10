package br.edu.ifpr.cars.domain;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank(message = "É necessário digitar um nome")
    @Size(min = 3, max=50, message = "Tamanho deve ser entre 3 e 50 caracteres")
    String name;

    @NotBlank(message = "É necessário digitar um e-mail")
    @Email(message = "Formato de e-mail inválido")
    String email;

    @NotBlank(message = "É necessário digitar um CPF")
    @CPF(message = "Formato de CPF inválido")
    String cpf;

    LocalDate birthDate;

}