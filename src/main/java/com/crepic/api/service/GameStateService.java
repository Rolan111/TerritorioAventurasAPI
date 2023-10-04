package com.crepic.api.service;

import com.crepic.api.model.GameState;
import com.crepic.api.repository.GameStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class GameStateService {

    @Autowired
    private GameStateRepository gameStateRepository;

    public GameState save(@RequestBody GameState gameState) {
        return gameStateRepository.save(gameState);
    }
}
