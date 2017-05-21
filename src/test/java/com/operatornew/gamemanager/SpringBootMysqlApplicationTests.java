package com.operatornew.gamemanager;

import com.operatornew.gamemanager.domain.Game;
import com.operatornew.gamemanager.repository.GameRepository;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMysqlApplicationTests {

    @Autowired
    private GameRepository gameRepository;

    @Test
    public void testLoadGames() {
        List<Game> games = (ArrayList<Game>) gameRepository.findAll();
        assertEquals("Did not get all games", 3, games.size());
    }
}
