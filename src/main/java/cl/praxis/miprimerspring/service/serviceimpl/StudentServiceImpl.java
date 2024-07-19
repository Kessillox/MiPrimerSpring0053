package cl.praxis.miprimerspring.service.serviceimpl;

import cl.praxis.miprimerspring.entity.Student;
import cl.praxis.miprimerspring.repository.IStudentRepository;
import cl.praxis.miprimerspring.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentServiceImpl")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Student getStudent(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
