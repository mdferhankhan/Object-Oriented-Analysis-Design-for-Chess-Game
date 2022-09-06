package PlayChess;

public class Queen extends Piece{
	public boolean canMove(Board board, Block startBlock, Block endBlock) {
		return false;
	}
	
	public Queen(boolean white) {
		super(white);
	}
}
