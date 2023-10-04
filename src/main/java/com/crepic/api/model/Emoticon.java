package com.crepic.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "emoticon")
public class Emoticon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emoticon")
    public int idEmoticon;

    @Column(name = "name")
    public String name;

}
