package com.crepic.api.controller;

import com.crepic.api.dto.BaseEntity;
import com.crepic.api.model.GameState;
import com.crepic.api.service.GameStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gameState")
public class GameStateController {

    @Autowired
    private GameStateService gameStateService;

    @PostMapping("save")
    public ResponseEntity<BaseEntity> save(@RequestBody GameState gameState) {
        try {
            return ResponseEntity.ok(gameStateService.save(gameState));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
