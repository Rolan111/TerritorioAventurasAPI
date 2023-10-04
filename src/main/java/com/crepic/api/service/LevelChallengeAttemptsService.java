package com.crepic.api.service;

import com.crepic.api.model.LevelChallengeAttempts;
import com.crepic.api.repository.LevelChallengeAttemptsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LevelChallengeAttemptsService {

    @Autowired
    private LevelChallengeAttemptsRepository levelChallengeAttemptsRepository;

    public LevelChallengeAttempts save(LevelChallengeAttempts levelChallengeAttempts) {
        return levelChallengeAttemptsRepository.save(levelChallengeAttempts);
    }
}
