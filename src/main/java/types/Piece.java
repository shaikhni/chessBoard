package types;

import exception.MoveNotPossibleException;
import utils.ColumnNames;
import utils.Cordinate;

import java.util.ArrayList;
import java.util.List;

public interface Piece {


    public  boolean isValidPosition(int n, int row, int column);


    default  List<String> getMovesForAllCordinates(int i, int row, int column, List<Cordinate> possibleCordinates) throws MoveNotPossibleException {
        List finalTypeMoves = new ArrayList<String>();
        for (Cordinate cordinate : possibleCordinates) {
            getAllMovesByCordinate(row, column, cordinate.row, cordinate.column, finalTypeMoves);
        }
        return finalTypeMoves;
    }

    default void getAllMovesByCordinate(int row, int column, int rowInc, int columnInc, List<Cordinate> finalTypeMoves) throws MoveNotPossibleException {
        List typeMoveList = findAllMovesByCordinate(8, row, column,rowInc,columnInc);
        addEachMoveToTheList(finalTypeMoves, typeMoveList);
    }

    public  List<Cordinate> findAllMovesByCordinate(int n, int row, int column, int rowInc, int columnInc) throws MoveNotPossibleException ;


    default void addEachMoveToTheList(List finalTypeMoves, List<Cordinate> typeList) {
        for (Cordinate cordinate :  typeList) {
            Integer columnMapping = cordinate.column;
            String  columnToMove = (String) new ColumnNames().getColumnMappings().get(columnMapping);
            System.out.println(columnToMove + cordinate.row);
            finalTypeMoves.add(columnToMove + cordinate.row);
        }
    }

}
