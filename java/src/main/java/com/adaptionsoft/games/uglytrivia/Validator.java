package com.adaptionsoft.games.uglytrivia;

public class Validator {

    static void validatePlayers(String ... gamePlayers){
        if (gamePlayers.length < 2)
            throw new IllegalArgumentException("At least two players are required");
        if (gamePlayers.length > 6)
            throw new IllegalArgumentException("Only six players are allowed");

        for (String player : gamePlayers) {
            if (player == null || player.isBlank())
                throw new IllegalArgumentException("Player's name is required");
        }
    }


}
