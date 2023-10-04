package com.crepic.api.controller;

import com.crepic.api.model.Avatar;
import com.crepic.api.service.AvatarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("avatar")
public class AvatarController {

    @Autowired
    private AvatarService avatarService;

    @PostMapping("save")
    public ResponseEntity<Avatar> save(@RequestBody Avatar avatar) {
        try {
            return ResponseEntity.ok(avatarService.save(avatar));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
