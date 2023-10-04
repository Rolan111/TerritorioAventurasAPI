package com.crepic.api.service;

import com.crepic.api.model.Avatar;
import com.crepic.api.repository.AvatarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvatarService {

    @Autowired
    private AvatarRepository avatarRepository;

    public Avatar save(Avatar avatar) {
        return avatarRepository.save(avatar);
    }
}
