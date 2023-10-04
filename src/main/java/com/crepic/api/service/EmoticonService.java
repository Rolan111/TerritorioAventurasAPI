package com.crepic.api.service;

import com.crepic.api.model.Emoticon;
import com.crepic.api.repository.EmoticonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmoticonService {

    @Autowired
    private EmoticonRepository emoticonRepository;

    public Emoticon save(@RequestBody Emoticon emoticon) {
        return emoticonRepository.save(emoticon);
    }
}
