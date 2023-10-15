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

public class QueenTest {

    List<Cordinate> possibleCordinates;

    private PieceFactory pieceFactory;

    private Piece piece;

    @Before
    public void setUp() throws Exception {
        pieceFactory = new PieceFactory();
        piece = pieceFactory.getPiece("Queen");
        possibleCordinates = new Cordinate().getListOfValidCordinates();
    }

    @After
    public void tearDown() throws Exception {
        this.piece = null;
        this.pieceFactory = null;
    }


    @Test
    public void testQueenMovementWhenOn8thRow() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = piece.getMovesForAllCordinates(8, 8, 5,possibleCordinates); //E8
        Assert.assertEquals(result.size(), 21);
    }


    @Test
    public void testQueenMovementWhenOn1stRow() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = piece.getMovesForAllCordinates(8, 1, 3,possibleCordinates); //C1
        Assert.assertEquals(result.size(), 21);
    }

    @Test
    public void testQueenMovementWhenInAllDirections() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = piece.getMovesForAllCordinates(8, 4, 5,possibleCordinates); //E4
        Assert.assertEquals(result.size(), 27);
    }


}
