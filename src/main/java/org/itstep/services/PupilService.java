package org.itstep.services;

import org.itstep.entities.Pupil;
import org.itstep.repositories.PupilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PupilService {

    @Autowired
    PupilRepository pupilRepository;

    public List<Pupil> findAll() {
        return pupilRepository.findAll();
    }
}
