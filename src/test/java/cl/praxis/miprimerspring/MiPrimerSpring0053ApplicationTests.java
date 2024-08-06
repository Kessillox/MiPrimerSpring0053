package cl.praxis.miprimerspring;

import cl.praxis.miprimerspring.entity.Student;
import cl.praxis.miprimerspring.repository.IStudentRepository;
import cl.praxis.miprimerspring.service.serviceimpl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class MiPrimerSpring0053ApplicationTests {

    @Mock
    private IStudentRepository repository;

    @InjectMocks
    private StudentServiceImpl studentService;

    @Test
    void contextLoads() {
        Student student = new Student();
        student.setName("Bryan");
        student.setSurname("Cabrera");
        student.setBirthDate(LocalDate.of(1999, 5, 2));
        student.setEmail("bryancabreram3@gmail.com");

        studentService.save(student);
        verify(repository, times(1)).save(student);
    }
}
