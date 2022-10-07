package com.example.louie.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data

public class SongsDTO {
    private Long id;

    private String name;
    private String urlVideo;
    private String urlMp3;
    private String urlImage;
    private String description;

    private Long id_user;
}
