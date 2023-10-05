package com.crepic.api.model;

import com.crepic.api.dto.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "gender")
public class Gender extends BaseEntity {

    @Column(name = "gender")
    public String gender;

}
