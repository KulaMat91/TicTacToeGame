package org.TicTacToe;

public class Board {

    private char[][] board;

    public Board(){
        this.board = new char[3][3];
    }

    public char[][] getBoard() {
        return board;
    }

    public void printBoard() {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

    }
}