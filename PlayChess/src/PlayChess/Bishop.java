package PlayChess;

public class Bishop extends Piece{
	public Bishop(boolean white) {
		super(white);
	}
	
	public boolean canMove(Board board, Block startBlock, Block endBlock) {
		return false;
	}
}
