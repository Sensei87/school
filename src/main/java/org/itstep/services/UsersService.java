package org.itstep.services;

import org.itstep.entities.Roles;
import org.itstep.entities.Users;
import org.itstep.repositories.RoleRepository;
import org.itstep.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class UsersService implements UserServicesInter{


    @Autowired
    private UserRepository userRepository;


    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<Users> findAll(){

        return userRepository.findAll();
    }

    @Override
    public Users findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void saveUser(Users users) {
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        users.setActive(1);
        Roles userRoles = roleRepository.findByName("ADMIN");
        users.setRolesList(new HashSet<Roles>(Arrays.asList(userRoles)));
        userRepository.save(users);

    }
}
