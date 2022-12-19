package com.hair.ryan_hair_back.service;

import com.hair.ryan_hair_back.model.Closure;
import com.hair.ryan_hair_back.repository.ClosureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClosureService {
    @Autowired
    private ClosureRepository closureRepository;

    public ClosureService(ClosureRepository closureRepository) {
        this.closureRepository = closureRepository;
    }

    public Iterable<Closure> getAllClosures() {
        return closureRepository.findAll();
    }

    public Optional<Closure> getClosureById(final Long id) {
        return closureRepository.findById(id);
    }

    public Closure saveOrUpdateClosure(Closure closure) {
        Closure savedClosure = closureRepository.save(closure);
        return savedClosure;
    }

    public void deleteClosureById(Long id) {
        closureRepository.deleteById(id);
    }

}
