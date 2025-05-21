package com.projectpersonal.dslist.service;

import com.projectpersonal.dslist.dto.GameDTO;
import com.projectpersonal.dslist.dto.GameListDTO;
import com.projectpersonal.dslist.dto.GameMinDTO;
import com.projectpersonal.dslist.entities.Game;
import com.projectpersonal.dslist.entities.GameList;
import com.projectpersonal.dslist.repositories.GameListRepository;
import com.projectpersonal.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {

       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
