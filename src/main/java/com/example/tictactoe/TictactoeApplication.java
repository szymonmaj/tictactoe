package com.example.tictactoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TictactoeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TictactoeApplication.class, args);
	}

	{
		int dim = 3;
		char[][] board = new char[dim][dim];
		// wstawiam X i O w wybrane miejsca dla demonstracji
		board[1][1] = 'X';
		board[2][2] = 'O';
		printBoard(board);
	}

	private static void printBoard(char[][] board) {
		int dim = board.length;
		// nagłówki kolumn
		System.out.print("\t");
		for (int i = 0; i < dim; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int row = 0; row < dim; row++) {
			System.out.print(row + ":\t");
			for (int column = 0; column < dim; column++) {
				System.out.print(board[row][column] + "\t");
			}
			System.out.println();
		}
	}
}
