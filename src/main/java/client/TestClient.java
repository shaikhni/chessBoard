package client;

import exception.MoveNotPossibleException;
import piececreation.PieceFactory;
import piecemovement.Piece;
import utils.ColumnNames;
import utils.Cordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestClient {


    public static void main(String[] args) {
        int size = 8;

        //Inputs the type (For eg "Pawn")
        Scanner inputType = new Scanner(System.in);
        System.out.println("Enter Type");
        String type = inputType.nextLine();

        //Inputs the position (For eg "E2")
        System.out.println("Enter Position");
        String position = inputType.nextLine();
        char[] posArray = position.toCharArray();

        //Converts the Aplhabet "E" to "5" as column is considered in the form of number.
        Character columnAsChar = posArray[0];
        Integer columnAsInt = convertColumnFromCharToInteger(columnAsChar);
        Integer row = Integer.parseInt(String.valueOf(posArray[1]));


        // To create the type of piece so that the client class does not need to be changed in case of piece addition.
        PieceFactory pieceFactory = new PieceFactory();
        try {
            Piece piece = pieceFactory.getPiece(type);
            piece.getMovesForAllCordinates(size, row, columnAsInt, piece.getPossibleCordinates(type));
        } catch (MoveNotPossibleException e) {
            e.printStackTrace();
        }

    }

    private static Integer convertColumnFromCharToInteger(Character columnAsChar) {
        int columnAsInt = 0;
        for (Map.Entry<Integer, String> entry : new ColumnNames().getColumnMappings().entrySet()) {
            if (entry.getValue().equalsIgnoreCase(columnAsChar.toString())) {
                columnAsInt = entry.getKey();
                break;
            }
        }
        return columnAsInt;
    }


}



