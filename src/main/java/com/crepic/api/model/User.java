package com.crepic.api.model;

import com.crepic.api.dto.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "name")
    public String name;

    @Column(name = "age")
    public String age;

    @Column(name = "email")
    public String email;

    @Column(name = "school")
    public String school;

    @Column(name = "user")
    public String user;

    @Column(name = "password")
    public String password;

    @Column(name = "id_gender")
    public int idGender;

    @Column(name = "id_rol")
    public int idRol;

}
