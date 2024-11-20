package com.ilouse.mario.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements GamingConsole {
    public void up() {
        System.out.println("up");
    }

    public void down() {
        System.out.println("down  ");
    }

    public void left() {
        System.out.println("left  ");
    }

    public void right() {
        System.out.println("right");
    }
}
