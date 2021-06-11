package com.julianbunch.tictactoe;

public class RandomPlayer implements IPlayer {
    public void move(Board board) {
        int xs = 0, os = 0, row, col;
        Square.Value symbol = Square.Value.X;

        // Count number of x's and o's, set symbol to the lesser, X default
        for (int i = 0; i < Board.SIZE * Board.SIZE; i++) {
            if (board.isX(i / Board.SIZE, i % Board.SIZE)) {
                xs++;
            } else if (board.isO(i / Board.SIZE, i % Board.SIZE)) {
                os++;
            }
        }
        if (os < xs) {
            symbol = Square.Value.O;
        }

        mBoard[row][col].setValue(symbol);
    }
}
