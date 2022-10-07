package com.example.louie.models;


import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "songs_by_category")
public class SongsByCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    @Column(name = "delete_at")
    private Date deleteAt;

    @ManyToOne
    @JoinColumn(name="id_song", nullable=false)
    private Songs songs;

    @ManyToOne
    @JoinColumn(name="id_category", nullable=false)
    private CategoryOfSongs categoryOfSongs;
}
