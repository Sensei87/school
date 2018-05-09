package org.itstep.services;

import org.itstep.entities.Clazz;
import org.itstep.repositories.ClazzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzService {

    @Autowired
    ClazzRepository clazzRepository;

    public List<Clazz> findAll() {
        return clazzRepository.findAll();
    }
}
