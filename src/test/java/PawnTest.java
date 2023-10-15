import exception.MoveNotPossibleException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import piececreation.PieceFactory;
import piecemovement.King;
import piecemovement.Pawn;
import piecemovement.Piece;
import piecemovement.Queen;
import utils.Cordinate;

import java.util.ArrayList;
import java.util.List;

public class PawnTest {


    List<Cordinate> possibleCordinates;

    List<Cordinate> pawnCordinates;

    private PieceFactory pieceFactory;

    private Piece piece;

    @Before
    public void setUp() throws Exception {
        pieceFactory = new PieceFactory();
        piece = pieceFactory.getPiece("Pawn");
        possibleCordinates = new Cordinate().getListOfValidCordinates();
        pawnCordinates = new ArrayList<Cordinate>();
        pawnCordinates.add(possibleCordinates.get(0));
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testPawnIfValidMovement() throws MoveNotPossibleException {

        Assert.assertEquals("E5", piece.getMovesForAllCordinates(8, 4, 5, pawnCordinates).get(0)); //E4
    }

    @Test(expected = MoveNotPossibleException.class)
    public void testPawnIfInValidMovement() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = piece.getMovesForAllCordinates(8, 8, 5, pawnCordinates);//E8
    }


}
