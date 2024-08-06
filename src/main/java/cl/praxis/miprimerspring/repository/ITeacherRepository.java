package cl.praxis.miprimerspring.repository;

import cl.praxis.miprimerspring.entity.Student;
import cl.praxis.miprimerspring.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, Long> {

}
