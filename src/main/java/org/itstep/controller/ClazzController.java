package org.itstep.controller;

import org.itstep.entities.Clazz;
import org.itstep.services.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @GetMapping("clazz/all")
    ResponseEntity<List<Clazz>> findAll() {
        List<Clazz> result = clazzService.findAll();
        return new ResponseEntity<>(result , HttpStatus.OK);
    }
}
