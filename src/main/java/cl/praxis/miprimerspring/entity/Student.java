package cl.praxis.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="estudiantes")
public class Student extends Person{
    @Id //indica que la columna es PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //esto genera el id autoincremental
    @Column(name = "id_estudiante", nullable = false, unique = true)//indica que es columna en la BD y su nombre
    private long id;
    /*Many to One con clase curso*/
    @ManyToOne
    private Course course;
    @OneToMany(mappedBy = "student")
    private List<Grade> notas = new ArrayList<>();



}
