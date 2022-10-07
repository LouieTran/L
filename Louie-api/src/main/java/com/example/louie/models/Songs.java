package com.example.louie.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "songs")
@Data
public class Songs implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "url_video")
    private String urlVideo;

    @Column(name = "url_mp3")
    private String urlMp3;

    @Column(name = "url_image")
    private String urlImage;

    @Column(name = "description")
    private String description;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    @Column(name = "delete_at")
    private Date deleteAt;

    @Column(name="id_user")
    private Long idUser;

    @OneToMany(mappedBy="songs")
    private Set<SongsByCategory> songsByCategories;

    @ManyToOne
//    @JsonProperty("id_user")
//    @JoinColumn(name="id_user", nullable=false)
    @JoinColumn(name="id_user",insertable = false,updatable = false, nullable = false)
    private User user;
}
