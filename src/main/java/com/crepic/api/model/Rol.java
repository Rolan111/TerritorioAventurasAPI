package com.crepic.api.model;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    public int idRol;

    @Column(name = "name_rol")
    public String nameRol;

}
