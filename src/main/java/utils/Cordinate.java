package utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cordinate {

    public int row;
    public int column;

    public Cordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Cordinate() {
    }


    public List<Cordinate> getListOfValidCordinates(){
        List<Cordinate> cordinates = new ArrayList<Cordinate>();
        cordinates.add(new Cordinate(1,0));
        cordinates.add(new Cordinate(1,1));
        cordinates.add(new Cordinate(1,-1));
        cordinates.add(new Cordinate(0,-1));
        cordinates.add(new Cordinate(0,1));
        cordinates.add(new Cordinate(-1,-1));
        cordinates.add(new Cordinate(-1,0));
        cordinates.add(new Cordinate(-1,1));
        return cordinates;
    }
}
