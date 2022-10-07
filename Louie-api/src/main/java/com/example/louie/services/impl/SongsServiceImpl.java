package com.example.louie.services.impl;

import com.example.louie.dto.SongsDTO;
import com.example.louie.models.Songs;
import com.example.louie.models.User;
import com.example.louie.repositorys.SongsRepository;
import com.example.louie.services.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongsServiceImpl implements SongsService {

    @Autowired
    private SongsRepository songsRepository;

    @Override
    public List<Songs> getAllSong() {
        return songsRepository.findAll();
    }

    @Override
    public SongsDTO createSong(SongsDTO songsDTO, User user) {
        Songs songs = ConvertSongDTOToSongEntity(songsDTO);
        songsRepository.save(songs);
        return songsDTO;
    }

    public Songs ConvertSongDTOToSongEntity(SongsDTO songsDTO) {
        Songs songs = new Songs();
        songs.setName(songsDTO.getName());
        songs.setUrlImage(songsDTO.getUrlImage());
        songs.setUrlVideo(songsDTO.getUrlVideo());
        songs.setUrlMp3(songsDTO.getUrlMp3());
        songs.setDescription(songsDTO.getDescription());
        songs.setIdUser(songsDTO.getId_user());
        return songs;
    }
}
