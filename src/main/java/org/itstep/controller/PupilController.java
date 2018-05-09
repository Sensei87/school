package org.itstep.controller;

import org.itstep.entities.Pupil;
import org.itstep.services.PupilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController()
public class PupilController {

    @Autowired
    private PupilService pupilService;

    @GetMapping("/pupils/all")
    public ResponseEntity<List<Pupil>> findAll() {
        List<Pupil> result = pupilService.findAll();
        return new ResponseEntity<>(result , HttpStatus.OK);
    }
}
