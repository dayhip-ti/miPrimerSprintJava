package cl.awakelab.miprimerspring2.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data //toString, constructores, getter y setter
@Entity //convierte la clase en un modelo
@Table(name="usuarios") //genera el nombre de la tabla
public class Usuario {
    @Id //genera el siguiente atributo en ID y pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //le indica que sera auto incrementable
    private int idUsuario;

    private int rut;

    private String contrasenia;

    private String perfil;

}
