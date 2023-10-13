package types;

import utils.ColumnNames;
import utils.Cordinate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pawn extends Piece {


      public List<String> move( int i, int row,int column){
          List finalPawnMoves = new ArrayList<String>();
          prepareFinalMoves(row, column,1,0, finalPawnMoves);
          return finalPawnMoves;
      }

}
