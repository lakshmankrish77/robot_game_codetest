import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.codetest.Game;
import com.codetest.exception.PlayerRobotException;
import com.codetest.robotgame.board.SquareBoard;
import com.codetest.robotgame.player.moves.DirectionsEnum;
import com.codetest.robotgame.player.moves.PlayerPosition;
import com.codetest.robotgame.players.RobotPlayer;
import com.codetest.robotgame.rules.BoardGameRules;

public class GameTest {

    final int MAX_ROWS = 4;
    final int MAX_COLUMNS = 4;
    
    SquareBoard board; 
    Game game;
    RobotPlayer robotPlayer;
    BoardGameRules rules;
    
    @Before public void initialize () {
    	board = new SquareBoard();
        robotPlayer = new RobotPlayer();
        game = new Game(board, robotPlayer);
        rules = new BoardGameRules();
        rules.setBoardParams(MAX_ROWS, MAX_COLUMNS);
    }
    
    @Test
    public void testEval1() throws PlayerRobotException {

        board.setGameRules(rules);
        game.initialPlayerPlacements("PLACE 0,0,NORTH");
        game.movePlayer("MOVE");
        Assert.assertEquals("0,1,NORTH", game.movePlayer("REPORT"));


    }
    
    @Test
    public void testEval2() throws PlayerRobotException {	    
	    board.setGameRules(rules);
	    	    
	    game.initialPlayerPlacements("PLACE 0,0,NORTH");
        game.movePlayer("LEFT");
        Assert.assertEquals("0,0,WEST", game.movePlayer("REPORT"));
    }
    
    @Test
    public void testEval3() throws PlayerRobotException {	    
	    board.setGameRules(rules);	    	    
	    game.initialPlayerPlacements("PLACE 1,2,EAST");
	    game.movePlayer("MOVE");
	    game.movePlayer("MOVE");
	    game.movePlayer("LEFT");
	    game.movePlayer("MOVE");
        Assert.assertEquals("3,3,NORTH", game.movePlayer("REPORT"));
    }
}
