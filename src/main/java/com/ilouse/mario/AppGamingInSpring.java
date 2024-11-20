package com.ilouse.mario;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ilouse.mario.games.GameRunner;
import com.ilouse.mario.games.GamingConsole;
import com.ilouse.mario.games.MarioGame;
import com.ilouse.mario.games.Pacman;
import com.ilouse.mario.games.SuperContraGame;

@Configuration
@ComponentScan("com.ilouse.mario.games")
public class AppGamingInSpring {

  @Bean
  public String myName() {
    return "ilyasou";
  }

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(AppGamingInSpring.class);

    var gameRunner = context.getBean(GameRunner.class);
    gameRunner.run();

    System.out.println("Below all the beans created : \n \n ");

    Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println); // displaying all beans

    context.close();
  }

}





/* @Bean
  public GameRunner gameRunner2(GamingConsole gamingConsole) {
    return new GameRunner(gamingConsole);


  } */