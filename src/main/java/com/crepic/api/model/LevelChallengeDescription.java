package com.crepic.api.model;

import com.crepic.api.dto.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "level_challenge_description")
public class LevelChallengeDescription extends BaseEntity {
    @Column(name = "name_level")
    public String nameLevel;

    @Column(name = "name_badge")
    public String nameBadge;

    @Column(name = "coins")
    public String coins;

    @Column(name = "id_emoticon")
    public int idEmoticon;

}
