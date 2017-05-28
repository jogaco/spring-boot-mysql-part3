package com.operatornew.gamemanager.controller;

import com.operatornew.gamemanager.domain.Game;
import com.operatornew.gamemanager.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/games")
public class GameRestController {
    
    private final GameRepository gameRepository;
    
    @Autowired
    public GameRestController(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    Iterable<Game> index() {
        return this.gameRepository.findAll();
    }
        
}
