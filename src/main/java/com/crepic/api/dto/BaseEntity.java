package com.crepic.api.dto;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@MappedSuperclass
public class BaseEntity {

    @Id
    @Hidden
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @Hidden
    @Column(name = "register_date")
    public Timestamp registerDate;

}
