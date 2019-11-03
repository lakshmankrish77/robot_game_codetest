package com.codetest.robotgame.player.moves;

import com.codetest.exception.PlayerRobotException;
import com.codetest.robotgame.board.GameBoard;
import com.codetest.robotgame.players.RobotPlayer;
import com.codetest.robotgame.rules.BoardGameRules;

public class MovePlayer {
	
	GameBoard squareBoard;
    RobotPlayer robot;
    BoardGameRules rules;
    		
	public MovePlayer(GameBoard squareBoard, RobotPlayer robot) {
        this.squareBoard = squareBoard;
        this.robot = robot;
        rules = squareBoard.getGameRules();
    }    

    public String initialPlayerPlacements(String playerInitialPosition) throws PlayerRobotException {
    	InitialPlacement initial = new InitialPlacement();
    	return initial.initialPlayerPlacements(playerInitialPosition, robot, squareBoard);
    }
    
    public String move (String inputString) throws PlayerRobotException {
    	SubsequentMoves subsequentMoves = new SubsequentMoves();
    	return subsequentMoves.move(inputString, robot, rules);
    }

}
