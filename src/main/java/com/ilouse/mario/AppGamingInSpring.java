package com.ilouse.mario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ilouse.mario.games.GameRunner;
import com.ilouse.mario.games.GamingConsole;
import com.ilouse.mario.games.MarioGame;
import com.ilouse.mario.games.Pacman;
import com.ilouse.mario.games.SuperContraGame;

public class AppGamingInSpring {
  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(AppGamingConfiguration.class);

    var marioGame = context.getBean(MarioGame.class);
    var superContraGame = context.getBean(SuperContraGame.class);
    var pacmac = context.getBean(Pacman.class);

    var gameRunnerForMario = new GameRunner(marioGame);
    var gameRunnerForSuperContra = new GameRunner(superContraGame);
    var gameRunnerForPacman = new GameRunner(pacmac);

    System.out.println("Mario game :");
    gameRunnerForMario.run();

    System.out.println("Super contra game :");
    gameRunnerForSuperContra.run();

    System.out.println("Pacman game :");
    gameRunnerForPacman.run();

    context.close();
  }
}
