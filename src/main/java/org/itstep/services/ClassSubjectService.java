package org.itstep.services;

import org.itstep.entities.ClassSubject;
import org.itstep.repositories.ClassSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassSubjectService {

    @Autowired
    ClassSubjectRepository classSubjectRepository;

    public List<ClassSubject> findAll() {
        return classSubjectRepository.findAll();
    }
}
