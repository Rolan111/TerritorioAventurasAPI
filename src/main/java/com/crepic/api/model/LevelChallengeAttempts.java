package com.crepic.api.model;

import com.crepic.api.dto.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "level_challenge_attempts")
public class LevelChallengeAttempts extends BaseEntity {

    @Column(name = "id_challenge_description")
    public int idChallengeDescription;

    @Column(name = "attempts")
    public String attempts;

    @Column(name = "game_time")
    public String gameTime;

}
