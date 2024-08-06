package cl.praxis.miprimerspring.controller;

import cl.praxis.miprimerspring.entity.Course;
import cl.praxis.miprimerspring.entity.Student;
import cl.praxis.miprimerspring.service.ICrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class studentController {

    @Autowired
    private ICrudService<Student, Long> studentService;
    @Autowired
    private ICrudService<Course, Long> courseService;
    //El controlador debería ser similar en los modelos cambiando el llamado al servicio (interfaz) y el Modelo (la clase)
    @GetMapping()
    public String getAllStudents(Model model) {
        List<Student> students = studentService.findAll();
        model.addAttribute("estudiantes", students);//estudiantes en español para diferenciar de java y corresponde a la vista
        return "students";
    }

    @GetMapping("/new")
    public String viewFormNewStudent(Model model) {
        model.addAttribute("estudiante", new Student());
        model.addAttribute("cursos", courseService.findAll());
        return "student/form";
    }

    @PostMapping
    public String guardarEstudiante(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/student";
    }
}
