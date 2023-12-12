package com.crepic.api.controller;

import com.crepic.api.dto.BaseEntity;
import com.crepic.api.model.Gender;
import com.crepic.api.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gender")
public class GenderController {

    @Autowired
    private GenderService genderService;

    @PostMapping()
    public ResponseEntity<BaseEntity> save(@RequestBody Gender gender) {
        try {
            return ResponseEntity.ok(genderService.save(gender));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
