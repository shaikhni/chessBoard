package piececreation;

import piecemovement.Queen;

class QueenCreation implements PieceCreation {

    @Override
    public Queen createPiece() {
        return new Queen();
    }
}
