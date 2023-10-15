package piecemovement;


import utils.Cordinate;
import java.util.ArrayList;
import java.util.List;


public class King implements Piece {


    public boolean isValidPosition(int n, int row, int column) {
        return (row <=n && row >=1 && column <=n && column >=1);
    }


    public List<Cordinate> findAllMovesByCordinate(int n, int row, int column, int rowInc, int columnInc)  {
        List<Cordinate> moves = new ArrayList<Cordinate>();
        Cordinate c = new Cordinate();
        row += rowInc;
        column += columnInc;
        c.row = row;
        c.column = column;
        if (isValidPosition(n, row, column)) {
            moves.add(c);
        }
        return moves;
    }




}

