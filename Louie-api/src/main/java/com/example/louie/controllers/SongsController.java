package com.example.louie.controllers;

import com.example.louie.dto.SongsDTO;
import com.example.louie.models.Songs;
import com.example.louie.models.User;
import com.example.louie.services.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


@RestController
public class SongsController {


    @Autowired
    private SongsService songsService;

    @GetMapping("/")
    public List<Songs> getAllSongs() {
        return songsService.getAllSong();
    }

    @PostMapping("/create-song")
    public ResponseEntity<SongsDTO> createSong(@RequestBody SongsDTO songsDTO, User user) {
        System.out.println("SSSSSS: " + songsDTO);
        songsService.createSong(songsDTO, user);
        return new ResponseEntity<>(songsDTO, HttpStatus.OK);
    }
}
