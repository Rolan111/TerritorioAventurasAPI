package com.crepic.api.model;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.*;

@Entity
@Table(name = "level_challenge_description")
public class LevelChallengeDescription {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_level_challenge_description")
    public int idLevelChallengeDescription;

    @Column(name = "name_badge")
    public String nameBadge;

    @Column(name = "coins")
    public String coins;
}
