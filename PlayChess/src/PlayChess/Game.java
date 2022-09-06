package PlayChess;
import java.util.*;

public class Game {
	private Board board;
	
	private Player player1;
	
	private Player player2;
	
	boolean isWhiteTurn;
	private ArrayList<Move> gameLog;
	private Status status;
	
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.board = new Board();
		this.isWhiteTurn = true;
		this.status = Status.ACTIVE;
		this.gameLog = new ArrayList<>();
	}
	
	public void start() {
		while(this.status == Status.ACTIVE) {
			if(isWhiteTurn) {
				//makeMove(new Move(startBlock, endBlock), player1));
			}
			else {
				//makeMove(new Move(startBlock, endBlock), player2));
			}
			
		}
	}
	
	public void makeMove(Move move, Player player) {
		
		if(move.isValid()) {
			Piece sourcePiece = move.getStartBlock().getPiece();
			
			if(sourcePiece.canMove(this.board, move.getStartBlock(), move.getEndBlock())) {
				Piece destinationPiece = move.getEndBlock().getPiece();
				
				if(destinationPiece != null) {
					
					if(destinationPiece instanceof King && isWhiteTurn) {
						this.status = Status.WHITE_WIN;
						return;
					}
					
					if(destinationPiece instanceof King && !isWhiteTurn) {
						this.status = Status.BLACK_WIN;
						return;
					}
					
					destinationPiece.setKilled(true);
				}
				
				gameLog.add(move);
				
				move.getEndBlock().setPiece(sourcePiece);
				
				move.getStartBlock().setPiece(null);
				
				isWhiteTurn = !isWhiteTurn;
			}
		}
	}
}
