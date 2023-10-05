package com.crepic.api.model;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.*;

@Entity
@Table(name = "level_challenge_attempts")
public class LevelChallengeAttempts {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_level_challenge_attempts")
    public int idLevelChallengeAttempts;

    @Column(name = "id_challenge_description")
    public int idChallengeDescription;

    @Column(name = "id_user")
    public int idUser;

    @Column(name = "attempts")
    public String attempts;

    @Column(name = "game_time")
    public String gameTime;

}
