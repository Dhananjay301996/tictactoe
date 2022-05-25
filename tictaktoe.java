package com.bridgelabz;
import java.util.*;

public class tictaktoe {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("welcome in Tic Tac Toe game");
        int row;
        int column;
        char player = 'x';

        char[][] board = new char[3][3];
        char ch = '1';

        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                board[i][j] = ch++;
            }

        }
    }
}
