package cl.praxis.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@MappedSuperclass
@Data
public class Person {
    @Column(name="nombre", nullable = false, length = 50)
    private String name;
    @Column(name = "apellido", nullable = true, length = 50)
    private String surname;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate birthDate;
    @Column(nullable = false, unique = true)
    private String email;
}
