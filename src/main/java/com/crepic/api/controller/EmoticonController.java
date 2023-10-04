package com.crepic.api.controller;

import com.crepic.api.model.Emoticon;
import com.crepic.api.service.EmoticonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emoticon")
public class EmoticonController {

    @Autowired
    private EmoticonService emoticonService;

    @PostMapping("save")
    public ResponseEntity<Emoticon> save(@RequestBody Emoticon emoticon) {
        try {
            return ResponseEntity.ok(emoticonService.save(emoticon));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
