package com.julianbunch;

import com.julianbunch.tictactoe.TicTacToe;

public class Main {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.move(1, 1 );
        game.move(0, 0);
        System.out.println(game.getGameString());
    }
}
