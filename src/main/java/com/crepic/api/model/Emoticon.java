package com.crepic.api.model;

import com.crepic.api.dto.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "emoticon")
public class Emoticon extends BaseEntity {

    @Column(name = "emoticon")
    public String emoticon;

}
