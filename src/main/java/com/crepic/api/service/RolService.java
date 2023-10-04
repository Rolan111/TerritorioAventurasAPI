package com.crepic.api.service;

import com.crepic.api.model.Rol;
import com.crepic.api.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public Rol save(@RequestBody Rol rol) {
        return rolRepository.save(rol);
    }
}
