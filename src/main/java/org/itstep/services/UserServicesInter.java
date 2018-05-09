package org.itstep.services;


import org.itstep.entities.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserServicesInter {
     Users findByUsername(String username);
     void saveUser(Users users);
}
