package com.codetest;

import com.codetest.exception.PlayerRobotException;
import com.codetest.robotgame.board.GameBoard;
import com.codetest.robotgame.board.SquareBoard;
import com.codetest.robotgame.player.moves.MovePlayer;
import com.codetest.robotgame.players.RobotPlayer;
import com.codetest.robotgame.rules.BoardGameRules;

public class Game {

    GameBoard squareBoard;
    RobotPlayer robot;
    MovePlayer playerMoves;


    public MovePlayer getPlayerMoves() {    	
		return playerMoves;
	}

	public void setPlayerMoves(MovePlayer playerMoves) {
		this.playerMoves = playerMoves;
	}

	public Game(GameBoard squareBoard, RobotPlayer robot) {
        this.squareBoard = squareBoard;
        this.robot = robot;
        if(playerMoves == null) {
    		this.playerMoves = new MovePlayer(this.squareBoard, this.robot);
    	}
    }

    public String initialPlayerPlacements(String playerInitialPosition) throws PlayerRobotException {
    	this.playerMoves = new MovePlayer(this.squareBoard, this.robot);
        return playerMoves.initialPlayerPlacements(playerInitialPosition);
    }

    public String movePlayer (String inputString) throws PlayerRobotException {
    	return this.playerMoves.move (inputString);
    }


    /**
     * Returns the current position of the robot
     */
    public String report() {
        if (robot.getPosition() == null)
            return null;

        return robot.getPosition().getX() + "," + robot.getPosition().getY() + "," + robot.getPosition().getDirectionEnum().toString();
    }
    
    public static void main(String[] args) {
    
    	    
    	SquareBoard board = new SquareBoard();
    	RobotPlayer robotPlayer = new RobotPlayer();
        Game game = new Game(board, robotPlayer);
        BoardGameRules rules = new BoardGameRules();
    }
    
    
}
