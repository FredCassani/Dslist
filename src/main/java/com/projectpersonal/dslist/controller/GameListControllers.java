package com.projectpersonal.dslist.controller;

import com.projectpersonal.dslist.dto.GameDTO;
import com.projectpersonal.dslist.dto.GameListDTO;
import com.projectpersonal.dslist.dto.GameMinDTO;
import com.projectpersonal.dslist.service.GameListService;
import com.projectpersonal.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListControllers {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
