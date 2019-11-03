package com.codetest.robotgame.rules;

import com.codetest.exception.PlayerRobotException;
import com.codetest.robotgame.player.moves.PlayerPosition;
import com.codetest.robotgame.players.RobotPlayer;

public class BoardGameRules extends AbstractRules {
	
	int maxRows = 5;
    int maxColumns = 5;
    private PlayerPosition playerPosition;
    
	public void setBoardParams (int maxRows, int maxColumns) {
		this.maxRows=maxRows;
		this.maxColumns = maxColumns;		
	}
	
    public boolean isValidPosition(PlayerPosition position) {    	
        return !(
                position.getX() > this.maxRows || position.getX() < 0 ||
                        position.getY() > this.maxColumns|| position.getY() < 0
        );
    }
    
    
    
    
    public PlayerPosition getNextPosition(PlayerPosition currentPosition) throws PlayerRobotException {
        if (currentPosition.getDirectionEnum() == null)
            throw new PlayerRobotException("Invalid robot direction");

        PlayerPosition newPosition = new PlayerPosition(currentPosition);
        switch (currentPosition.getDirectionEnum()) {
            case NORTH:
                newPosition.change(0, 1);
                break;
            case EAST:
                newPosition.change(1, 0);
                break;
            case SOUTH:
                newPosition.change(0, -1);
                break;
            case WEST:
                newPosition.change(-1, 0);
                break;
        }
        return newPosition;
    }
    
    

}
