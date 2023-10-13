package types;

import utils.ColumnNames;
import utils.Cordinate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class King extends Piece {


    public HashMap findMovesInAllDirections(int n, int x, int y, int xinc, int yinc) {
        HashMap m = new HashMap();
        Cordinate c = new Cordinate();
        x += xinc;
        y += yinc;
        c.row = x;
        c.column = y;
        if (isValidKingQueenPosition(n, x, y)) {
            m.put(c, c);
        }
        return m;
    }

    public List<String> move(int i, int row, int column) {
        List finalKingMoves = new ArrayList<String>();
        for (Cordinate cordinate : new Cordinate().getListOfValidCordinates()) {
            prepareFinalMoves(row, column, cordinate.row, cordinate.column, finalKingMoves);
        }
        return finalKingMoves;
    }

}

