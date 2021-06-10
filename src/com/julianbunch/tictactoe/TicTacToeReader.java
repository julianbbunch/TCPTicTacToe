package com.julianbunch.tictactoe;

public class TicTacToeReader {
    private String mBoard;

    public TicTacToeReader(String board) {
        mBoard = board;
    }

    public Square[][] createGame() {
        Square[][] board = new Square[TicTacToe.SIZE][TicTacToe.SIZE];
        int strIndex = 0, boardIndex = 0;

        while (strIndex < board.length && boardIndex < TicTacToe.SIZE * TicTacToe.SIZE) {
            if ('X' == mBoard.charAt(strIndex) || 'x' == mBoard.charAt(strIndex)) {
                board[boardIndex / TicTacToe.SIZE][boardIndex % TicTacToe.SIZE]
                        = new Square(Square.Value.X);
                boardIndex++;
            } else if ('O' == mBoard.charAt(strIndex) || 'o' == mBoard.charAt(strIndex)) {
                board[boardIndex / TicTacToe.SIZE][boardIndex % TicTacToe.SIZE]
                        = new Square(Square.Value.O);
                boardIndex++;
            }
            strIndex++;
        }

        return board;
    }
}
