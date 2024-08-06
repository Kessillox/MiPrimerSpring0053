package cl.praxis.miprimerspring.service.serviceimpl;

import cl.praxis.miprimerspring.entity.Teacher;
import cl.praxis.miprimerspring.service.ICrudService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("teacherServiceImpl")
public class TeacherServiceImpl implements ICrudService<Teacher,Long> {
    @Override
    public List<Teacher> findAll() {
        return List.of();
    }

    @Override
    public Teacher findById(Long aLong) {
        return null;
    }

    @Override
    public Teacher save(Teacher entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
