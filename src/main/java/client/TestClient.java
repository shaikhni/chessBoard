package client;

import exception.MoveNotPossibleException;
import types.King;
import types.Pawn;
import types.Queen;
import utils.ColumnNames;
import utils.Cordinate;


import java.util.*;

public class TestClient {


    public static void main(String[] args) {
        int size = 8;
        Scanner inputType = new Scanner(System.in);
        System.out.println("Enter Type");
        String type = inputType.nextLine();
        System.out.println("Enter Position");
        String position = inputType.nextLine();
        char[] posArray = position.toCharArray();

        Character columnAsChar = posArray[0];
        Integer columnAsInt = convertColumnFromCharToInteger(columnAsChar);
        Integer row = Integer.parseInt(String.valueOf(posArray[1]));

        try {
            if (type.equalsIgnoreCase("pawn")) {
                new Pawn().getMovesForAllCordinates(size, row, columnAsInt,getPossibleCordinates(type));
            } else if (type.equalsIgnoreCase("king")) {
                new King().getMovesForAllCordinates(size, row, columnAsInt,getPossibleCordinates(type));
            } else {
                new Queen().getMovesForAllCordinates(size, row, columnAsInt,getPossibleCordinates(type));
            }

        } catch (MoveNotPossibleException e) {
            e.printStackTrace();
        }

    }

    private static Integer convertColumnFromCharToInteger(Character columnAsChar) {
        int columnAsInt =0;
        for (Map.Entry<Integer, String> entry : new ColumnNames().getColumnMappings().entrySet()) {
            if (entry.getValue().equalsIgnoreCase(columnAsChar.toString())) {
                columnAsInt= entry.getKey();
                break;
            }

        }

        return columnAsInt;

    }

    private static List<Cordinate> getPossibleCordinates(String pieceType){
        List<Cordinate> allPossibleCordinates = new Cordinate().getListOfValidCordinates();
        if(pieceType.equalsIgnoreCase("pawn")){
            List<Cordinate> pawnCoridnates = new ArrayList<Cordinate>();
                 pawnCoridnates.add(allPossibleCordinates.get(0));
            return pawnCoridnates;
        }
        return allPossibleCordinates;
    }


}



