package org.itstep.services;

import org.itstep.entities.Grade;
import org.itstep.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    @Autowired
    GradeRepository gradeRepository;

    public List<Grade> findAll() {
        return gradeRepository.findAll();
    }
}
