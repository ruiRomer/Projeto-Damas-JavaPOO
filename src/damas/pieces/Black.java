package damas.pieces;

import boardgame.Board;
import damas.CheckersPiece;
import damas.Color;

public class Black extends CheckersPiece {

	public Black(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "B";
	}

}
