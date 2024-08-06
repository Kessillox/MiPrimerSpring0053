package cl.praxis.miprimerspring.repository;

import cl.praxis.miprimerspring.entity.Student;
import cl.praxis.miprimerspring.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectRepository extends JpaRepository<Subject, Long> {

}
