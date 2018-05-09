package org.itstep.services;

import org.itstep.entities.Roles;
import org.itstep.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

   @Autowired
    RoleRepository roleRepository;

    public List<Roles> findAll() {
        return roleRepository.findAll();
    }
}
