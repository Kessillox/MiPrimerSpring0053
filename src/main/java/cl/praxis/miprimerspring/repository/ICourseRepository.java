package cl.praxis.miprimerspring.repository;

import cl.praxis.miprimerspring.entity.Course;
import cl.praxis.miprimerspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends JpaRepository<Course, Long> {

}
