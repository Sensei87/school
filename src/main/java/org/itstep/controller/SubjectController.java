package org.itstep.controller;

import org.itstep.entities.Subject;
import org.itstep.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("subject/all")
    ResponseEntity<List<Subject>> findAll() {
        List<Subject> result = subjectService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
