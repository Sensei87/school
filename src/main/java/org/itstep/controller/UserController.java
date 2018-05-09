package org.itstep.controller;

import org.itstep.entities.Users;
import org.itstep.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
//@Controller
public class UserController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users/all")
    public ResponseEntity<List<Users>> findAll() {
        List<Users> result = usersService.findAll();
        return new ResponseEntity<>(result , HttpStatus.OK);
    }

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @RequestMapping(value = {"/registration"}, method = RequestMethod.GET)
    public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView();
        Users users = new Users();

        modelAndView.addObject("users", users);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid Users users, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        Users usersExists = usersService.findByUsername(users.getUsername());
        if (usersExists != null) {
            bindingResult.rejectValue("username", "error.users", "There is already a user registered with the username provided");

        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            usersService.saveUser(users);
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("users", new Users());
            modelAndView.setViewName("registration");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/admin/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        Users users = usersService.findByUsername(auth.getName());
        modelAndView.addObject("userName", "welcome" + "(" + users.getUsername() + ") ");
        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("admin/home");
        return modelAndView;
    }


}
