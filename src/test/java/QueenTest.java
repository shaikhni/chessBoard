import exception.MoveNotPossibleException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import types.King;
import types.Pawn;
import types.Queen;
import utils.Cordinate;

import java.util.ArrayList;
import java.util.List;

public class QueenTest {


    private Queen queen;

    private Pawn pawn;

    private King king;

    List<Cordinate> possibleCordinates;

    List<Cordinate> pawnCordinates;


    @Before
    public void setUp() throws Exception {
        queen = new Queen();
        pawn = new Pawn();
        king = new King();
        possibleCordinates = new Cordinate().getListOfValidCordinates();
        pawnCordinates = new ArrayList<Cordinate>();
        pawnCordinates.add(possibleCordinates.get(0));
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testQueenMovementWhenOn8thRow() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = queen.getMovesForAllCordinates(8, 8, 5,possibleCordinates); //E8
        Assert.assertEquals(result.size(), 21);
    }


    @Test
    public void testQueenMovementWhenOn1stRow() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = queen.getMovesForAllCordinates(8, 1, 3,possibleCordinates); //C1
        Assert.assertEquals(result.size(), 21);
    }

    @Test
    public void testQueenMovementWhenInAllDirections() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = queen.getMovesForAllCordinates(8, 4, 5,possibleCordinates); //E4
        Assert.assertEquals(result.size(), 27);
    }


    @Test
    public void testPawnIfValidMovement() throws MoveNotPossibleException {

        Assert.assertEquals("E5", pawn.getMovesForAllCordinates(8, 4, 5,pawnCordinates).get(0)); //E4
    }

    @Test(expected = MoveNotPossibleException.class)
    public void testPawnIfInValidMovement() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = pawn.getMovesForAllCordinates(8, 8, 5,pawnCordinates);//E8
    }

    @Test
    public void testKingMovementWhenOn8thRow() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = king.getMovesForAllCordinates(8, 8, 5,possibleCordinates); //E8
        Assert.assertEquals(result.size(), 5);
    }

    @Test
    public void testKingMovementInAll8Directions() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = king.getMovesForAllCordinates(8, 4, 5,possibleCordinates); //D4
        Assert.assertEquals(result.size(), 8);
    }

    @Test
    public void testKingMovementWhenOn1stRow() throws MoveNotPossibleException {
        List result = new ArrayList<String>();
        result = king.getMovesForAllCordinates(8, 1, 3,possibleCordinates); //C1
        Assert.assertEquals(result.size(), 5);
    }

}
