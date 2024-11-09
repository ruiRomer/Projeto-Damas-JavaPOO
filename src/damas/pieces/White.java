package damas.pieces;

import boardgame.Board;
import damas.CheckersPiece;
import damas.Color;

public class White extends CheckersPiece {

	public White(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "W";
	}

	
}
