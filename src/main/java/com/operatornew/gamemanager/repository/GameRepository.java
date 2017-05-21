package com.operatornew.gamemanager.repository;

import java.util.List;

import com.operatornew.gamemanager.domain.Game;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GameRepository extends PagingAndSortingRepository<Game, Integer> {
    
    List<Game> findByName(String name);
    
}