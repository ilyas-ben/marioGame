package com.ilouse.mario;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ilouse.mario.games.GameRunner;
import com.ilouse.mario.games.GamingConsole;
import com.ilouse.mario.games.MarioGame;
import com.ilouse.mario.games.Pacman;
import com.ilouse.mario.games.SuperContraGame;

// We will create a spring context inside the jvm.  It s like a "SVM" somehow

// we create beans here
@Configuration
public class AppGamingConfiguration {
    @Bean
    public String name(){
        return  "ilyasou";
    }

    @Bean
    public GamingConsole mario(){
        return new MarioGame();
    }

    @Bean
    public GamingConsole superContraGame(){
        return new SuperContraGame();
    }

    @Bean
    public GamingConsole pacman(){
        return new Pacman();
    }

    
    @Bean
    public GameRunner gameRunner(@Qualifier("mario") GamingConsole gamingConsole){
        return new GameRunner(gamingConsole);
    }



    
}
