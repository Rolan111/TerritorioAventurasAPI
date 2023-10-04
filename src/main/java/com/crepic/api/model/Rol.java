package com.crepic.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    public int idRol;

    @Column(name = "name_rol")
    public String nameRol;

}
