package com.ilouse.mario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ilouse.mario.games.GameRunner;
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
    public MarioGame mario(){
        return new MarioGame();
    }

    @Bean
    public SuperContraGame superContraGame(){
        return new SuperContraGame();
    }

    @Bean
    public Pacman pacman(){
        return new Pacman();
    }

    
}
