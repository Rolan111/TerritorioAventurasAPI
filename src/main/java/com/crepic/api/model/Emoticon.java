package com.crepic.api.model;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.*;

@Entity
@Table(name = "emoticon")
public class Emoticon {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emoticon")
    public int idEmoticon;

    @Column(name = "name")
    public String name;

}
