package com.crepic.api.model;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.*;

@Entity
@Table(name = "game_state")
public class GameState {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_game_state")
    public int idGameState;

    @Column(name = "id_user")
    public int idUser;

    @Column(name = "id_emoticon")
    public int idEmoticon;

    @Column(name = "id_avatar")
    public int idAvatar;

    @Column(name = "id_level_challenge_description")
    public int idLevelChallengeDescription;

}
