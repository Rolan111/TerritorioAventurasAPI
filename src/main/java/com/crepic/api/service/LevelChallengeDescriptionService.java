package com.crepic.api.service;

import com.crepic.api.model.LevelChallengeDescription;
import com.crepic.api.repository.LevelChallengeDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LevelChallengeDescriptionService {

    @Autowired
    private LevelChallengeDescriptionRepository levelChallengeDescriptionRepository;

    public LevelChallengeDescription save(@RequestBody LevelChallengeDescription levelChallengeDescription) {
        return levelChallengeDescriptionRepository.save(levelChallengeDescription);
    }
}

