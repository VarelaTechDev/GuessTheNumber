package com.av.guessTheNumber.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(scripts = "/clear_database.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
class ServiceLayerTest {

    @Test
    void beginGame() {
    }

    @Test
    void getAllGames() {
    }

    @Test
    void makeGuess() {
    }

    @Test
    void getGameById() {
    }

    @Test
    void getRoundsForGame() {
    }
}