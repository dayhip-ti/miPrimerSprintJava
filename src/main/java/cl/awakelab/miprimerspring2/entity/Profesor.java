package cl.awakelab.miprimerspring2.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.awt.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "Profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private LocalDate fechaNacimiento;
    @ManyToMany
    @JoinTable(name="curso_profesor",
        joinColumns = @JoinColumn(name = "Fk_Profesor", nullable = false),
        inverseJoinColumns = @JoinColumn(name ="Fk_Curso", nullable = false))
    private List<Curso> listaCursos;
}
