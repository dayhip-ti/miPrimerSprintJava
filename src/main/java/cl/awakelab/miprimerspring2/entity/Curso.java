package cl.awakelab.miprimerspring2.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;
    private String nombre;
    @OneToMany(mappedBy = "curso")
    private List<Alumno> listarAlumnos;
    @ManyToMany(mappedBy = "listaCursos")
    private List<Profesor> listaProfesores;
}
