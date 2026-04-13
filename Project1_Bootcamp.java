package org.example;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
////////////// print board
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
 ///////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void playerMove(char[][] board, Scanner in) {
        int row, col;
        while (true) {
            try {
                System.out.print("Enter row (1, 2, or 3): ");
                row = in.nextInt() - 1;

                System.out.print("Enter column (1, 2, or 3): ");
                col = in.nextInt() - 1;

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                    board[row][col] = 'X';
                    break;
                } else {
                    System.out.println("Invalid position or already taken. Try again!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter numbers only (1-3)!");
                in.nextLine();
            }
        }
    }

 /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void computerMove(char[][] board) {
        Random rand = new Random();
        while (true) {
            int row = rand.nextInt(3);
            int col = rand.nextInt(3);
            if (board[row][col] == '-') {
                board[row][col] = 'O';
                System.out.println("Computer chose: " + row + "," + col);
                break;
            }
        }
    }

 /////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static boolean checkWinner(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) return true;
        }
        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }

 /////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalRounds = 0;
        System.out.println("------------------------");
        System.out.println("--- Welcome to X & O ---");
        System.out.println("------------------------");


        while (true) {
            try {
                System.out.print("How many rounds would you like to play? (Max 3): ");
                totalRounds = in.nextInt();

                if (totalRounds <= 0 || totalRounds > 3) {
                    System.out.println("Invalid choice! Please enter a number between 1 and 3.");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input! Please enter a valid number.");
                in.nextLine();
            }
        }

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;


        for (int round = 1; round <= totalRounds; round++) {
            System.out.println("\n*************************");
            System.out.println("      ROUND " + round + " OF " + totalRounds);
            System.out.println("*************************");

            char[][] board = {
                    {'-', '-', '-'},
                    {'-', '-', '-'},
                    {'-', '-', '-'}
            };

            while (true) {
                printBoard(board);
                //Player
                System.out.println("Your turn (X):");
                playerMove(board, in);
                if (checkWinner(board, 'X')) {
                    printBoard(board);
                    System.out.println(">>> You won round " + round + "! <<<");
                    playerWins++;
                    break;
                }
                if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println(">>> Round " + round + " is a DRAW! <<<");
                    draws++;
                    break;
                }

                // computer
                System.out.println("Computer's turn (O):");
                computerMove(board);
                if (checkWinner(board, 'O')) {
                    printBoard(board);
                    System.out.println(">>> Computer won round " + round + "! <<<");
                    computerWins++;
                    break;
                }
                if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println(">>> Round " + round + " is a DRAW! <<<");
                    draws++;
                    break;
                }
            }
            System.out.println("Score: You [" + playerWins + "] - Computer [" + computerWins + "]");
        }

        // Result
        System.out.println("\n==== FINAL SCOREBOARD ====");
        System.out.println("Your Total Wins: " + playerWins);
        System.out.println("Computer Total Wins: " + computerWins);
        System.out.println("Total Draws: " + draws);
        if (playerWins > computerWins) System.out.println("RESULT: YOU ARE THE CHAMPION!");
        else if (computerWins > playerWins) System.out.println("RESULT: COMPUTER WINS THE MATCH!");
        else System.out.println("RESULT: THE MATCH ENDED IN A TIE!");
        in.close();

    }



}