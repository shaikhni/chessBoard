package piececreation;

import piecemovement.King;
import piecemovement.Pawn;
import piecemovement.Piece;
import piecemovement.Queen;


public class PieceFactory {
    public  Piece getPiece(String pieceType) {
        if (pieceType.equalsIgnoreCase("Pawn")) {
            return new PawnCreation().createPiece();
        } else if (pieceType.equalsIgnoreCase("King")) {
            return new KingCreation().createPiece();
        } else {
            return new QueenCreation().createPiece();
        }

    }
}
