package com.projectpersonal.dslist.repositories;

import com.projectpersonal.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
