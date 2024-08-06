package cl.praxis.miprimerspring.service;

import java.util.List;

public interface ICrudService<T, ID> {
    List<T> findAll();
    T findById(ID id);
    T save(T entity);
    void deleteById(ID id);
}
