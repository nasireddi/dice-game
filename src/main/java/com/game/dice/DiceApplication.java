package com.game.dice;

import com.game.dice.manager.GameManager;

public class DiceApplication {

    public static void main(String[] args) {
        GameManager.gameParameters();
        GameManager.playGame(GameManager.composeGame());
    }
}
