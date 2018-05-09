package org.itstep.controller;

import org.itstep.entities.Grade;
import org.itstep.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping("grade/all")
    ResponseEntity<List<Grade>> findAll() {
        List<Grade> result = gradeService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
