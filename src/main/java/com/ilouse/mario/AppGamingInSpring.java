package com.ilouse.mario;

import java.util.Arrays;

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

    var gameRunner = context.getBean(GameRunner.class);
    gameRunner.run();    

    System.out.println("Below all the beans created : \n \n ");
    
    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); // displaying all beans

    context.close();
  }
}
