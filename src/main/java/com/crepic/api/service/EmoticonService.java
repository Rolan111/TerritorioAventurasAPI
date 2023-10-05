package com.crepic.api.service;

import com.crepic.api.model.Avatar;
import com.crepic.api.model.Emoticon;
import com.crepic.api.repository.EmoticonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmoticonService {

    @Autowired
    private EmoticonRepository emoticonRepository;

    public Emoticon save(Emoticon emoticon) {
        return emoticonRepository.save(emoticon);
    }

    public List<Emoticon> findAll() {
        return emoticonRepository.findAll();
    }
}
