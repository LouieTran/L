package com.example.louie.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "category_of_song")
public class CategoryOfSongs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    @Column(name = "delete_at")
    private Date deleteAt;

    @OneToMany(mappedBy = "categoryOfSongs")
    private Set<SongsByCategory> songsByCategories;
}
