package app;

import boardgame.Board;
import damas.CheckersMatch;

public class Program {

	public static void main(String[] args) {
		
		CheckersMatch checkersMatch = new CheckersMatch();
		UI.printBoard(checkersMatch.getPieces());
	}

}
