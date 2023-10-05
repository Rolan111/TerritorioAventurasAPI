package com.crepic.api.service;

import com.crepic.api.model.Gender;
import com.crepic.api.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenderService {

    @Autowired
    private GenderRepository genderRepository;

    public Gender save(Gender gender) {
        return genderRepository.save(gender);
    }
}
