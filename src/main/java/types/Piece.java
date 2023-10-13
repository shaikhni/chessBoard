package types;

import utils.ColumnNames;
import utils.Cordinate;

import java.util.HashMap;
import java.util.List;

public class Piece {


    public boolean isValidPawnPosition(int n, int x, int y){
        return (x<n && x>1 && y<n && y>1);
    }

    public boolean isValidKingQueenPosition(int n, int x, int y){
        return (x<=n && x>=1 && y<=n && y>=1);
    }

    public HashMap findMovesInAllDirections(int n, int x, int y, int xinc, int yinc) {
        HashMap m = new HashMap();
        if (isValidPawnPosition(n, x, y)) {
            Cordinate c = new Cordinate();
            x+= xinc;
            y+= yinc;
            c.row = x;
            c.column = y;
            m.put(c,c);
        }
        return m;
    }


    public void prepareFinalMoves(int row, int column, int xinc, int yinc, List<Cordinate> finalQueenMoves) {
        HashMap queenList = findMovesInAllDirections(8, row, column,xinc,yinc);
        addEachMoveToTheList(finalQueenMoves, queenList);
    }

    private void addEachMoveToTheList(List finalKingMoves, HashMap queenList) {
        for (Object name :  queenList.keySet()) {
            Cordinate cordinate = (Cordinate)name;
            Integer columnMapping = cordinate.column;
            String  columnToMove = (String) new ColumnNames().getColumnMappings().get(columnMapping);
            System.out.println(columnToMove + cordinate.row);
            finalKingMoves.add(columnToMove + cordinate.row);
        }
    }

}
