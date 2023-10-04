package com.crepic.api.service;

import com.crepic.api.model.Avatar;
import com.crepic.api.repository.AvatarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AvatarService {

    @Autowired
    private AvatarRepository avatarRepository;

    public Avatar save(@RequestBody Avatar avatar) {
        return avatarRepository.save(avatar);
    }
}
