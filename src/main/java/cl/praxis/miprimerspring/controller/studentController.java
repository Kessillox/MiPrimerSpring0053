package cl.praxis.miprimerspring.controller;

import cl.praxis.miprimerspring.entity.Student;
import cl.praxis.miprimerspring.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class studentController {

    @Autowired
    private IStudentService studentService;
    //El controlador debería ser similar en los modelos cambiando el llamado al servicio (interfaz) y el Modelo (la clase)
    @GetMapping("/getAll")
    public String getAllStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("estudiantes", students);//estudiantes en español para diferenciar de java y corresponde a la vista
        return "students";
    }

    /*
    public String getStudentById(Model model, Long id) {
        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);
        return "student/student";
    }*/

}
