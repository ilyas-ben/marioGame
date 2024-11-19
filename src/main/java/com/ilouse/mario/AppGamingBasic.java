package com.ilouse.mario;

import com.ilouse.mario.games.GameRunner;
import com.ilouse.mario.games.MarioGame;
import com.ilouse.mario.games.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args) {

        var marioGame= new MarioGame();
        var SuperContraGame = new SuperContraGame();

        var gameRunnerForMario = new GameRunner(marioGame); // Tight coupling :  when this class is depending  one onclass cause it s contrsuctor depends only on one MarioClass

        var gameRunnerForSuperContra = new GameRunner(marioGame);

        System.out.println("Mario game :");
        gameRunnerForMario.run();
        System.out.println("Super contra game :");
        gameRunnerForSuperContra.run();
    }
}
