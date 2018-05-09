package org.itstep.controller;

import org.itstep.entities.Lesson;
import org.itstep.services.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @GetMapping("lesson/all")
    ResponseEntity<List<Lesson>> findAll() {
        List<Lesson> result = lessonService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
