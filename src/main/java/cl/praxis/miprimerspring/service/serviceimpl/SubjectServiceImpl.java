package cl.praxis.miprimerspring.service.serviceimpl;

import cl.praxis.miprimerspring.entity.Subject;
import cl.praxis.miprimerspring.service.ICrudService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("subjectServiceImpl")
public class SubjectServiceImpl implements ICrudService<Subject,Long> {
    @Override
    public List<Subject> findAll() {
        return List.of();
    }

    @Override
    public Subject findById(Long aLong) {
        return null;
    }

    @Override
    public Subject save(Subject entity) {
        return null;
    }

    @Override
    public void deleteById(Long aLong) {

    }
}
