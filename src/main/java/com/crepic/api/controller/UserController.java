package com.crepic.api.controller;

import com.crepic.api.dto.BaseEntity;
import com.crepic.api.model.User;
import com.crepic.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findByUserAndPassword")
    public ResponseEntity<BaseEntity> findByUserAndPassword(@RequestParam String user, String password) {
        return ResponseEntity.ok(userService.findByUserAndPassword(user, password));
    }

    @PostMapping("save")
    public ResponseEntity<BaseEntity> save(@RequestBody User user) {
        try {
            return ResponseEntity.ok(userService.save(user));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
