package org.itstep.services;

import org.itstep.entities.UserRoles;
import org.itstep.repositories.UserRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleService {

    @Autowired
    UserRolesRepository userRolesRepository;

    public List<UserRoles> findAll() {
        return userRolesRepository.findAll();
    }
}
