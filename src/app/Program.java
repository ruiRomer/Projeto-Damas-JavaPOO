package app;

import boardgame.Board;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch checkersMatch = new ChessMatch();
		UI.printBoard(checkersMatch.getPieces());
	}

}
