package com.crepic.api.model;

import com.crepic.api.dto.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "game_state")
public class GameState extends BaseEntity {

    @Column(name = "id_user")
    public int idUser;

    @Column(name = "id_avatar")
    public int idAvatar;

    @Column(name = "id_level_challenge_description")
    public int idLevelChallengeDescription;

}
