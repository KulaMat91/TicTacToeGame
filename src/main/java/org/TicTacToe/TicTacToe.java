package org.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {


        Board board = new Board();

        board.printBoard();

//        Player Move
        Scanner scanner = new Scanner(System.in);
        playerTurn(board, scanner);

//        Computer Move
        Random random = new Random();
        while (true){
            int computerTurn = random.nextInt(9) + 1;
            if(isValidMove(board,computerTurn)){
                break;
            }
        }


    }

    private static boolean isValidMove(Board board, int position) {
        switch (position) {
            case 1:
                return board.getBoard()[0][0] == ' ';
            case 2:
                return board.getBoard()[0][1] == ' ';
            case 3:
                return board.getBoard()[0][2] == ' ';
            case 4:
                return board.getBoard()[1][0] == ' ';
            case 5:
                return board.getBoard()[1][1] == ' ';
            case 6:
                return board.getBoard()[1][2] == ' ';
            case 7:
                return board.getBoard()[2][0] == ' ';
            case 8:
                return board.getBoard()[2][1] == ' ';
            case 9:
                return board.getBoard()[2][2] == ' ';
            default:
               return false;
        }
    }


    private static void playerTurn(Board board, Scanner scanner) {

        System.out.println("Where would you like to put your symbol?(Input: 1-9)");
        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                board.getBoard()[0][0] = 'X';
                break;
            case "2":
                board.getBoard()[0][1] = 'X';
                break;
            case "3":
                board.getBoard()[0][2] = 'X';
                break;
            case "4":
                board.getBoard()[1][0] = 'X';
                break;
            case "5":
                board.getBoard()[1][1] = 'X';
                break;
            case "6":
                board.getBoard()[1][2] = 'X';
                break;
            case "7":
                board.getBoard()[2][0] = 'X';
                break;
            case "8":
                board.getBoard()[2][1] = 'X';
                break;
            case "9":
                board.getBoard()[2][2] = 'X';
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
