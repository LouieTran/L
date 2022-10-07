package com.example.louie.services;


import com.example.louie.dto.SongsDTO;
import com.example.louie.models.Songs;
import com.example.louie.models.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SongsService {
    List<Songs> getAllSong();

    SongsDTO createSong(SongsDTO songsDTO, User user);
}
