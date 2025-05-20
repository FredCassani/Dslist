package com.projectpersonal.dslist.repositories;

import com.projectpersonal.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
