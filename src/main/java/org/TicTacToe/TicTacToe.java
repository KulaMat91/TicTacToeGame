package org.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {


        Board board = new Board();
        board.printBoardNumbers();
        System.out.println();

        while (true) {
//        Player Move
            playerTurn(board);
            if (isGameFinished(board)) {
                break;
            }
            board.printBoard();
//        Computer Move
            computerTurn(board);
            if (isGameFinished(board)) {
                break;
            }
            board.printBoard();
        }

    }

    private static boolean isGameFinished(Board board) {
        if (isWinner(board, 'X')) {
            System.out.println("Player Wins!");
            board.printBoard();
            return true;
        }
        if (isWinner(board, 'O')) {
            System.out.println("Computer Wins!");
            board.printBoard();
            return true;
        }

        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard().length; j++) {
                if (board.getBoard()[i][j] == ' ') {
                    return false;
                }
            }
        }
        board.printBoard();
        System.out.println("Game is tie!");
        return true;
    }

    private static boolean isWinner(Board board, char symbol) {
        if ((board.getBoard()[0][0] == symbol && board.getBoard()[0][1] == symbol && board.getBoard()[0][2] == symbol) ||
                (board.getBoard()[1][0] == symbol && board.getBoard()[1][1] == symbol && board.getBoard()[1][2] == symbol) ||
                (board.getBoard()[2][0] == symbol && board.getBoard()[2][1] == symbol && board.getBoard()[2][2] == symbol) ||

                (board.getBoard()[0][0] == symbol && board.getBoard()[1][0] == symbol && board.getBoard()[2][0] == symbol) ||
                (board.getBoard()[0][1] == symbol && board.getBoard()[1][1] == symbol && board.getBoard()[2][1] == symbol) ||
                (board.getBoard()[0][2] == symbol && board.getBoard()[1][2] == symbol && board.getBoard()[2][2] == symbol) ||

                (board.getBoard()[0][0] == symbol && board.getBoard()[1][1] == symbol && board.getBoard()[2][2] == symbol) ||
                (board.getBoard()[0][2] == symbol && board.getBoard()[1][1] == symbol && board.getBoard()[2][0] == symbol)) {
            return true;
        }
        return false;
    }

    private static void computerTurn(Board board) {
        Random random = new Random();
        int computerMove;
        while (true) {
            computerMove = random.nextInt(9) + 1;
            if (isValidMove(board, computerMove)) {
                break;
            }
        }
        System.out.println("Computer choose: " + computerMove);
        placeMove(board, Integer.toString(computerMove), 'O');
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

    private static void playerTurn(Board board) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while (true) {
            System.out.println("Where would you like to put your symbol?(Input: 1-9)");
            userInput = scanner.nextLine();
            try {
                if (isValidMove(board, Integer.parseInt(userInput))) {
                    break;
                } else {
                    System.out.println(userInput + " is not valid move!");
                }
            } catch (NumberFormatException exception) {
                System.err.println("You have to write a digit!");
            }
        }
        placeMove(board, userInput, 'X');
    }

    private static void placeMove(Board board, String userInput, char symbol) {
        switch (userInput) {
            case "1":
                board.getBoard()[0][0] = symbol;
                break;
            case "2":
                board.getBoard()[0][1] = symbol;
                break;
            case "3":
                board.getBoard()[0][2] = symbol;
                break;
            case "4":
                board.getBoard()[1][0] = symbol;
                break;
            case "5":
                board.getBoard()[1][1] = symbol;
                break;
            case "6":
                board.getBoard()[1][2] = symbol;
                break;
            case "7":
                board.getBoard()[2][0] = symbol;
                break;
            case "8":
                board.getBoard()[2][1] = symbol;
                break;
            case "9":
                board.getBoard()[2][2] = symbol;
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
