package com.example.louie.repositorys;

import com.example.louie.models.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongsRepository extends JpaRepository<Songs,Long> {
}
