package cl.awakelab.miprimerspring2.repository;

import cl.awakelab.miprimerspring2.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno,Integer> {
}
