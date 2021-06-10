package com.julianbunch.tictactoe;

public class TicTacToe {
    public static final int SIZE = 3;
    private Square[][] mBoard = new Square[SIZE][SIZE];

    public TicTacToe() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                mBoard[row][col] = new Square();
            }
        }
    }

    public TicTacToe(TicTacToeReader reader) {
        mBoard = reader.createGame();
    }

    public void move(int row, int col) {
        int xs = 0, os = 0;
        Square.Value symbol = Square.Value.X;

        // Count number of x's and o's, set symbol to the lesser, X default
        for (int i = 0; i < TicTacToe.SIZE * TicTacToe.SIZE; i++) {
            if (mBoard[i / TicTacToe.SIZE][i % TicTacToe.SIZE].isX()) {
                xs++;
            } else if (mBoard[i / TicTacToe.SIZE][i % TicTacToe.SIZE].isO()) {
                os++;
            }
        }
        if (os < xs) {
            symbol = Square.Value.O;
        }

        mBoard[row][col].setValue(symbol);
    }

    public String getGameString() {
        String gameStr = new String();

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (mBoard[row][col].isX()) {
                    gameStr += 'X';
                } else if (mBoard[row][col].isO()) {
                    gameStr += 'O';
                } else if (mBoard[row][col].isEmpty()) {
                    gameStr += '.';
                }
            }
        }

        return gameStr;
    }
}
