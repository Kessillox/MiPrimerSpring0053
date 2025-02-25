package cl.praxis.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cursos")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private int id;
    @Column(name = "titulo", nullable = false, length = 50)
    private String title;
    @Column(name = "descripcion", nullable = false, length = 100)
    private String description;
    @OneToMany(mappedBy = "course")
    private List<Student> students;
    @ManyToMany
    @JoinTable(
            name = "profesor_curso",
            joinColumns = @JoinColumn(name = "id_profesor"),
            inverseJoinColumns = @JoinColumn(name = "id_curso" )
    )
    private List<Teacher> teachers;
    @OneToMany(mappedBy = "course")
    private List<Subject> subjects;


}
