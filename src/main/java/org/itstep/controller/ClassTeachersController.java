package org.itstep.controller;

import org.itstep.entities.ClassTeachers;
import org.itstep.services.ClassTeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassTeachersController {

    @Autowired
    private ClassTeachersService classTeachersService;

    @GetMapping("classTeachers/all")
    public ResponseEntity<List<ClassTeachers>> findAll() {
        List<ClassTeachers> result = classTeachersService.findAll();
        return new ResponseEntity<>(result , HttpStatus.OK);
    }
}
