package com.codetest.robotgame.player.moves;

import com.codetest.exception.PlayerRobotException;
import com.codetest.robotgame.board.GameBoard;
import com.codetest.robotgame.players.RobotPlayer;
import com.codetest.robotgame.rules.BoardGameRules;
import com.codetest.robotgame.rules.Command;

public class InitialPlacement {
	
	
	public boolean placeRobot(PlayerPosition position, RobotPlayer robot, GameBoard squareBoard) throws PlayerRobotException {

        if (squareBoard == null)
            throw new PlayerRobotException("Invalid squareBoard object");

        if (position == null)
            throw new PlayerRobotException("Invalid position object");

        if (position.getDirectionEnum() == null)
            throw new PlayerRobotException("Invalid direction value");

        // validate the position
        if (!squareBoard.getGameRules().isValidPosition(position))
            return false;

        // if position is valid then assign values to fields
        robot.setPosition(position);
        return true;
    }
    

    public String initialPlayerPlacements(String playerInitialPosition, RobotPlayer robot, GameBoard squareBoard) throws PlayerRobotException {
    	String[] args = playerInitialPosition.split(" ");
    	
    	// validate PLACE params
        String[] params;
        int x = 0;
        int y = 0;
        
        Command command;
        try {
            command = Command.valueOf(args[0]);
        } catch (IllegalArgumentException e) {
            throw new PlayerRobotException("Invalid command");
        }
        
        DirectionsEnum commandDirection = null;
        if (command == Command.PLACE) {
        	try {
        		params = args[1].split(",");            
                x = Integer.parseInt(params[0]);
                y = Integer.parseInt(params[1]);
                commandDirection = DirectionsEnum.valueOf(params[2]);
            } catch (Exception e) {
                throw new PlayerRobotException("Invalid command");
            }
        }
        if (args != null && args.length < 2) {
            throw new PlayerRobotException("Invalid command");
        }
        return String.valueOf(placeRobot(new PlayerPosition(x, y, commandDirection), robot, squareBoard));
    }

}
