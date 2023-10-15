package piececreation;

import piecemovement.King;

class KingCreation implements PieceCreation
{

    @Override
    public King createPiece() {
        return new King();
    }
}
