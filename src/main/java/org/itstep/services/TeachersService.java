package org.itstep.services;

import org.itstep.entities.Teachers;
import org.itstep.repositories.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersService {

    @Autowired
    TeachersRepository teachersRepository;

    public List<Teachers> findAll() {
        return teachersRepository.findAll();
    }
}
