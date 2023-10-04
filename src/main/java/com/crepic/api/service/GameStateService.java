package com.crepic.api.service;

import com.crepic.api.model.GameState;
import com.crepic.api.repository.GameStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameStateService {

    @Autowired
    private GameStateRepository gameStateRepository;

    public GameState save(GameState gameState) {
        return gameStateRepository.save(gameState);
    }
}
