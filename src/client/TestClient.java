package client;

import types.King;
import types.Pawn;
import types.Queen;
import utils.ColumnNames;


import java.util.Map;
import java.util.Scanner;

public class TestClient {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Type");
        String type = sc.nextLine();
        System.out.println("Enter Position");
        String position = sc.nextLine();
        char[] c = position.toCharArray();
        Integer row = Integer.parseInt(String.valueOf(c[1]));
        Character column = c[0];
        Integer columnInt = 0;

        // iterate each entry of hashmap
        for (Map.Entry<Integer, String> entry : new ColumnNames().getColumnMappings().entrySet()) {
            if (entry.getValue().equalsIgnoreCase(column.toString())) {
             //   System.out.println("The key for value " + column + " is " + entry.getKey());
                columnInt = entry.getKey();
                break;
            }
        }
           if(type.equalsIgnoreCase("pawn")){
               new Pawn().move(8,row,columnInt);
           }else if(type.equalsIgnoreCase("king")){
               new King().move(8,row,columnInt);
           }else{
               new Queen().move(8,row,columnInt);
           }

        }

    }






