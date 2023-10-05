package com.crepic.api.controller;

import com.crepic.api.dto.BaseEntity;
import com.crepic.api.model.Rol;
import com.crepic.api.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping("save")
    public ResponseEntity<BaseEntity> save(@RequestBody Rol rol) {
        try {
            return ResponseEntity.ok(rolService.save(rol));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
