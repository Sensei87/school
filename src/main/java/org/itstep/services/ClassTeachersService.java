package org.itstep.services;

import org.itstep.entities.ClassTeachers;
import org.itstep.repositories.ClassTeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassTeachersService {

    @Autowired
    ClassTeachersRepository classTeachersRepository;

    public List<ClassTeachers> findAll() {
        return classTeachersRepository.findAll();
    }
}
