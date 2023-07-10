package cl.awakelab.miprimerspring2.repository;

import cl.awakelab.miprimerspring2.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor,Integer> {
}
