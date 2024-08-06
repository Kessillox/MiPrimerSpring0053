package cl.praxis.miprimerspring.service.serviceimpl;

import cl.praxis.miprimerspring.entity.Grade;
import cl.praxis.miprimerspring.repository.IGradeRepository;
import cl.praxis.miprimerspring.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("gradeServiceImpl")
public class GradeServiceImpl implements ICrudService<Grade,Long> {

    @Autowired
    private IGradeRepository gradeRepository;

    @Override
    public List<Grade> findAll() {
        return List.of();
    }

    @Override
    public Grade findById(Long aLong) {
        return null;
    }

    @Override
    public Grade save(Grade entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
