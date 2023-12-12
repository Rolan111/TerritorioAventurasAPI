package com.crepic.api.controller;

import com.crepic.api.dto.BaseEntity;
import com.crepic.api.model.LevelChallengeDescription;
import com.crepic.api.service.LevelChallengeDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("levelChallengeDescription")
public class LevelChallengeDescriptionController {

    @Autowired
    private LevelChallengeDescriptionService levelChallengeDescriptionService;

    @PostMapping()
    public ResponseEntity<BaseEntity> save(@RequestBody LevelChallengeDescription levelChallengeDescription) {
        try {
            return ResponseEntity.ok(levelChallengeDescriptionService.save(levelChallengeDescription));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
