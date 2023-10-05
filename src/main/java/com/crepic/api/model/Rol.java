package com.crepic.api.model;

import com.crepic.api.dto.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "rol")
public class Rol extends BaseEntity {

    @Column(name = "rol")
    public String rol;

}
