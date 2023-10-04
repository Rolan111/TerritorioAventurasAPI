package com.crepic.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    public int idUser;

    @Column(name = "id_rol")
    public int idRol;

    @Column(name = "name_user")
    public String nameUser;

    @Column(name = "password")
    public String password;

}
