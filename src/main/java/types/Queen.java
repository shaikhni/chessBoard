package types;


import utils.ColumnNames;
import utils.Cordinate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Queen extends Piece {


    /*public boolean isValidPosition(int n, int x, int y){
        return (x<=n && x>=1 && y<=n && y>=1);
    }*/


public HashMap findMovesInAllDirections(int n, int row, int column, int xinc, int yinc) {
    HashMap m = new HashMap();
    while (isValidKingQueenPosition(n, row, column)) {
            Cordinate c = new Cordinate();
            row+= xinc;
            column+= yinc;
            c.row = row;
            c.column = column;
            if(row<=n && column<=n && row>=1 && column>=1) {
                m.put(c, c);
            }
        }
return m;
}


    public List<String> move(int i, int row, int column){
        List finalQueenMoves = new ArrayList<String>();
        for (Cordinate cordinate : new Cordinate().getListOfValidCordinates()) {
            prepareFinalMoves(row, column,cordinate.row,cordinate.column, finalQueenMoves);
        }
        return finalQueenMoves;
    }







}
