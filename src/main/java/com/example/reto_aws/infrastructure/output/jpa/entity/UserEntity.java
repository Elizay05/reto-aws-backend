package com.example.reto_aws.infrastructure.output.jpa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Document number field cannot be empty")
    private String documentNumber;

    @NotBlank(message = "Name field cannot be empty")
    private String name;

    @NotBlank(message = "Email field cannot be empty")
    private String email;
}
