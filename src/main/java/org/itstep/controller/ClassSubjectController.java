package org.itstep.controller;

import org.itstep.entities.ClassSubject;
import org.itstep.services.ClassSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassSubjectController {

    @Autowired
    private ClassSubjectService classSubjectService;

    @GetMapping("classSubject/all")
    public ResponseEntity<List<ClassSubject>> findAll() {
        List<ClassSubject> result = classSubjectService.findAll();
        return new ResponseEntity<>(result , HttpStatus.OK);
    }


}
