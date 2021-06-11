package com.julianbunch.tictactoe;

public class TicTacToeReader {
    private String mBoard;

    public TicTacToeReader(String board) {
        mBoard = board;
    }

    public Board createBoard() {
        Board board = new Board();
        int strIndex = 0, boardIndex = 0;

        while (strIndex < Board.SIZE && boardIndex < Board.SIZE * Board.SIZE) {
            if ('X' == mBoard.charAt(strIndex) || 'x' == mBoard.charAt(strIndex)) {
                board.setSquare(boardIndex / Board.SIZE,
                        boardIndex % Board.SIZE, Square.Value.X);
                boardIndex++;
            } else if ('O' == mBoard.charAt(strIndex) || 'o' == mBoard.charAt(strIndex)) {
                board.setSquare(boardIndex / Board.SIZE,
                        boardIndex % Board.SIZE, Square.Value.O);
                boardIndex++;
            }
            strIndex++;
        }

        return board;
    }
}
