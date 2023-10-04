package com.crepic.api.repository;

import com.crepic.api.model.LevelChallengeDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelChallengeDescriptionRepository extends JpaRepository<LevelChallengeDescription, Integer> {



}
