package com.crepic.api.controller;

import com.crepic.api.dto.BaseEntity;
import com.crepic.api.model.Avatar;
import com.crepic.api.model.Emoticon;
import com.crepic.api.service.EmoticonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emoticon")
public class EmoticonController {

    @Autowired
    private EmoticonService emoticonService;

    @PostMapping()
    public ResponseEntity<BaseEntity> save(@RequestBody Emoticon emoticon) {
        try {
            return ResponseEntity.ok(emoticonService.save(emoticon));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR). build();
        }
    }

    @GetMapping()
    public ResponseEntity<List<Emoticon>> findAll() {
        try {
            return ResponseEntity.ok(emoticonService.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
