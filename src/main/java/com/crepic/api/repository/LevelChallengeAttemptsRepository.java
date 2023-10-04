package com.crepic.api.repository;

import com.crepic.api.model.LevelChallengeAttempts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelChallengeAttemptsRepository extends JpaRepository<LevelChallengeAttempts, Integer> {



}
