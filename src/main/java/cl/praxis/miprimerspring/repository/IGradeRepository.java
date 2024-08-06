package cl.praxis.miprimerspring.repository;

import cl.praxis.miprimerspring.entity.Grade;
import cl.praxis.miprimerspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGradeRepository extends JpaRepository<Grade, Long> {

}
