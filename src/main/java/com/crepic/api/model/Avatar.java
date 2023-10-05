package com.crepic.api.model;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.*;

@Entity
@Table(name = "avatar")
public class Avatar {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_avatar")
    public int idAvatar;

    @Column(name = "type")
    public String type;

    @Column(name = "gender")
    public String gender;

}
