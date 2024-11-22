package com.ilouse.mario.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    //@Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    @Autowired
    public void setGame(GamingConsole game) {
        System.out.println("game"+game+"have been injected thr setter");
        this.game = game;
    }
    

    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Running game :" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}






