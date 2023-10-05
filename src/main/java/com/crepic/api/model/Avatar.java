package com.crepic.api.model;

import com.crepic.api.dto.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "avatar")
public class Avatar extends BaseEntity {

    @Column(name = "avatar")
    public String avatar;

    @Column(name = "id_gender")
    public int idGender;

}
