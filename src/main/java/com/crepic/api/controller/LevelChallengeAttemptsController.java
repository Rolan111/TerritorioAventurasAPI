package com.crepic.api.controller;

import com.crepic.api.model.LevelChallengeAttempts;
import com.crepic.api.service.LevelChallengeAttemptsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("levelChallengeAttempts")
public class LevelChallengeAttemptsController {

    @Autowired
    private LevelChallengeAttemptsService levelChallengeAttemptsService;

    @PostMapping("save")
    public ResponseEntity<LevelChallengeAttempts> save(@RequestBody LevelChallengeAttempts levelChallengeAttempts) {
        try {
            return ResponseEntity.ok(levelChallengeAttemptsService.save(levelChallengeAttempts));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
