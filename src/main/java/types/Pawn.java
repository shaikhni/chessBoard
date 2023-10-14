package types;

import exception.MoveNotPossibleException;
import utils.Cordinate;

import java.util.ArrayList;

import java.util.List;

public class Pawn implements Piece {

    public boolean isValidPosition(int n, int row, int column) {
        return (row <n && row >1 && column <n && column >1);
    }

    public List<Cordinate> findAllMovesByCordinate(int n, int row, int column, int rowinc, int columnInc) throws MoveNotPossibleException {
        List<Cordinate> moves = new ArrayList<Cordinate>();
        if (isValidPosition(n, row, column)) {
            Cordinate c = new Cordinate();
            row += rowinc;
            column += columnInc;
            c.row = row;
            c.column = column;
            moves.add(c);
        }else{
            throw new MoveNotPossibleException("Pawn movement not possible");
        }
        return moves;
    }
}
