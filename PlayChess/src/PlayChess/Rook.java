package PlayChess;

public class Rook extends Piece{
	public Rook(boolean white) {
		super(white);
	}
	
	public boolean canMove(Board board, Block StartBlock, Block endBlock) {
		return false;
	}
}
