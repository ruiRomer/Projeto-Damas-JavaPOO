package damas;

import boardgame.Board;
import boardgame.Position;
import damas.pieces.Black;

public class CheckersMatch {
	
	private Board board;
	
	public CheckersMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public CheckersPiece[][] getPieces(){
		CheckersPiece [][] mat = new CheckersPiece[board.getRows()][board.getColumns()];
		for (int i= 0; i<board.getRows(); i++) {
			for (int j= 0; j<board.getColumns(); j++) {
				mat[i][j] = (CheckersPiece) board.piece(i,j);
			}
		}
		
		return mat;
		
	}
	
	private void initialSetup() {
		board.placePiece(new Black(board, Color.BLACK), new Position(2,1));
	}
	
}
