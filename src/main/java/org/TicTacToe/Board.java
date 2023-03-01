package org.TicTacToe;

import java.util.Arrays;

public class Board {

    private char[][] board;

    public Board() {
        this.board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }
    }

    public void printBoardNumbers() {
        int temp = 48;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                temp ++;
                board[i][j] = (char) temp;
            }
        }

        for (int j = 0; j < board.length; j++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int k = 0; k < board[j].length; k++) {
                 stringBuilder.append(board[j][k]).append("|");
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            System.out.println(stringBuilder);
            if (j < board.length - 1){
                System.out.println("-+-+-");
            }
        }
        clearBoard();
    }
    public void clearBoard(){
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }
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