package com.ilouse.mario;

import com.ilouse.mario.games.GameRunner;
import com.ilouse.mario.games.MarioGame;
import com.ilouse.mario.games.Pacman;
import com.ilouse.mario.games.SuperContraGame;

public class AppGamingBasicInJava {
    public static void main(String[] args) {

        var marioGame= new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacmanGame = new Pacman();

        var gameRunnerForMario = new GameRunner(marioGame); // Tight coupling :  when this class is depending  one onclass cause it s contrsuctor depends only on one MarioClass

        var gameRunnerForSuperContra = new GameRunner(superContraGame);

        var gameRunnerForPacman = new GameRunner(pacmanGame);

        // do u know that theses objects are created in inside the jvm ?

        System.out.println("Mario game :");
        gameRunnerForMario.run();
        System.out.println("Super contra game :");
        gameRunnerForSuperContra.run();
        System.out.println("Pacman game :");
        gameRunnerForPacman.run();
    }
}
