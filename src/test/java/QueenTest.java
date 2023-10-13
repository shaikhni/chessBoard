
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import types.King;
import types.Pawn;
import types.Queen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QueenTest {


    private Queen queen;

    private Pawn pawn;

    private King king;


    @Before
    public void setUp() throws Exception {
        queen = new Queen();
        pawn = new Pawn();
        king = new King();
    }
    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testQueenMovementWhenOn8thRow() {
        List m = new ArrayList<String>();
        m=queen.move(8,8,5); //E8
        Assert.assertEquals(m.size(),21);
    }


    @Test
    public void testQueenMovementWhenOn1stRow() {
        List m = new ArrayList<String>();
        m=queen.move(8,1,3); //C1
        Assert.assertEquals(m.size(),21);
    }

    @Test
    public void testQueenMovementWhenInAllDirections() {
        List m = new ArrayList<String>();
        m=queen.move(8,4,5); //E4
        Assert.assertEquals(m.size(),27);
    }


    @Test
    public void testPawnIfValidMovement() {
        HashMap m = new HashMap();
        Assert.assertEquals("E5", pawn.move(8,4,5 ).get(0)); //E4
    }

    @Test
    public void testPawnIfInValidMovement() {
        List m = new ArrayList<String>();
        m=pawn.move(8,8,5);
        Assert.assertEquals(0,m.size() ); //E8
    }

    @Test
    public void testKingMovementWhenOn8thRow() {
        List m = new ArrayList<String>();
        m=king.move(8,8,5); //E8
        Assert.assertEquals(m.size(),5);
    }

    @Test
    public void testKingMovementInAll8Directions() {
        List m = new ArrayList<String>();
        m=king.move(8,4,5); //D4
        Assert.assertEquals(m.size(),8);
    }

    @Test
    public void testKingMovementWhenOn1stRow() {
        List m = new ArrayList<String>();
        m=king.move(8,1,3); //C1
        Assert.assertEquals(m.size(),5);
    }

}
