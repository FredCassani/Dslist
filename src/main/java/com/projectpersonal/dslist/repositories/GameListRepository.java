package com.projectpersonal.dslist.repositories;

import com.projectpersonal.dslist.entities.GameList;
import com.projectpersonal.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    List<GameMinProjection> searchByList(Long listId);

    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
        void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
