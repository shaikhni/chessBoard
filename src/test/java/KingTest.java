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

public class KingTest {


    List<Cordinate> possibleCordinates;

    private PieceFactory pieceFactory;

    private Piece piece;

    @Before
    public void setUp() throws Exception {
        pieceFactory = new PieceFactory();
        piece = pieceFactory.getPiece("King");
        possibleCordinates = new Cordinate().getListOfValidCordinates();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testKingMovementWhenOn8thRow() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = piece.getMovesForAllCordinates(8, 8, 5, possibleCordinates); //E8
        Assert.assertEquals(result.size(), 5);
    }

    @Test
    public void testKingMovementInAll8Directions() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = piece.getMovesForAllCordinates(8, 4, 5, possibleCordinates); //D4
        Assert.assertEquals(result.size(), 8);
    }

    @Test
    public void testKingMovementWhenOn1stRow() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = piece.getMovesForAllCordinates(8, 1, 3, possibleCordinates); //C1
        Assert.assertEquals(result.size(), 5);
    }

}
