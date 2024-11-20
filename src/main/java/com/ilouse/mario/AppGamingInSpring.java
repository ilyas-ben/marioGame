package com.ilouse.mario;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ilouse.mario.games.GameRunner;
import com.ilouse.mario.games.GamingConsole;
import com.ilouse.mario.games.MarioGame;
import com.ilouse.mario.games.Pacman;
import com.ilouse.mario.games.SuperContraGame;


@Configuration
public class AppGamingInSpring {

  @Bean
  public String myName() {
    return "ilyasou";
  }

  @Bean
  public GamingConsole mario() {
    return new MarioGame();
  }

  @Bean
  public GamingConsole superContraGame() {
    return new SuperContraGame();
  }

  @Bean
  public GamingConsole pacman() {
    return new Pacman();
  }

  @Bean
  public GameRunner gameRunner(@Qualifier("mario") GamingConsole gamingConsole) {
    return new GameRunner(gamingConsole);
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
