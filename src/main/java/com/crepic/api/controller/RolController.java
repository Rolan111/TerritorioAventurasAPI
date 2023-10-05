package com.crepic.api.controller;

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
    public ResponseEntity<Rol> save(@RequestBody Rol rol) {
        try {
            return ResponseEntity.ok(rolService.save(rol));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("save2roles")
    public ResponseEntity<Rol> save2roles(@RequestBody Rol rol) {
        try {
            return ResponseEntity.ok(rolService.save(rol));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("save2rolesx")
    public ResponseEntity<Rol> save2rolesx(@RequestBody Rol rol) {
        try {
            return ResponseEntity.ok(rolService.save(rol));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("save2rolesz")
    public ResponseEntity<Rol> save2rolesz(@RequestBody Rol rol) {
        try {
            return ResponseEntity.ok(rolService.save(rol));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("save2rolessss")
    public ResponseEntity<Rol> save2rsssoles(@RequestBody Rol rol) {
        try {
            return ResponseEntity.ok(rolService.save(rol));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
