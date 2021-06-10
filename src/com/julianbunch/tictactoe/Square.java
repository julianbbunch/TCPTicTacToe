package com.julianbunch.tictactoe;

public class Square {
    public enum Value {EMPTY, X, O};
    private Value mValue;

    public Square() {
        mValue = Value.EMPTY;
    }

    public Square(Value value) {
        mValue = value;
    }

    public void setValue(Value value) {
        mValue = value;
    }

    public boolean isX() {
        return mValue == Value.X;
    }

    public boolean isO() {
        return mValue == Value.O;
    }

    public boolean isEmpty() {
        return mValue == Value.EMPTY;
    }

    public char getSymbol() {
        char symbol;

        switch (mValue) {
            case X: symbol = 'X';
            break;
            case O: symbol = 'O';
            break;
            default: symbol = '.';
        }

        return symbol;
    }
}
