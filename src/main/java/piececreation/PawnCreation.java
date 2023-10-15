package piececreation;

import piecemovement.Pawn;



    class PawnCreation implements PieceCreation{

        @Override
        public Pawn createPiece() {
            return new Pawn();
        }
    }

