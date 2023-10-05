package com.crepic.api.repository;

import com.crepic.api.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository  extends JpaRepository<Gender, Integer> {



}
