package com.example.louie.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "types")
    private String types;

    @Column(name = "age")
    private int age;

    @Column(name = "description")
    private String description;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    @Column(name = "delete_at")
    private Date deleteAt;

    @OneToMany(mappedBy="user")
//    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Set<Songs> songs;
}