package com.codetest.robotgame.player.moves;

import com.codetest.exception.PlayerRobotException;
import com.codetest.robotgame.players.RobotPlayer;
import com.codetest.robotgame.rules.BoardGameRules;
import com.codetest.robotgame.rules.Command;

public class SubsequentMoves {

	 public String move (String inputString, RobotPlayer robot, BoardGameRules rules) throws PlayerRobotException {

       Command command;
       String output;
       
       try {
           command = Command.valueOf(inputString);
       } catch (IllegalArgumentException e) {
           throw new PlayerRobotException("Invalid command");
       }        
       
       switch (command) {
           case MOVE:
           	PlayerPosition  newPosition = rules.getNextPosition(robot.getPosition());                
               if (!rules.isValidPosition(newPosition)) {                	
                   output = String.valueOf(false);
               } else {
                   output = String.valueOf(robot.move(newPosition));                    
               }
               break;
           case LEFT:
               output = String.valueOf(robot.rotateLeft());
               break;
           case RIGHT:
               output = String.valueOf(robot.rotateRight());
               break;
           case REPORT:
           	System.out.println("" + report(robot));
               output = report(robot);
               break;
           default:
               throw new PlayerRobotException("Invalid command");
       }

       return output;
   }
	 
	 public String report(RobotPlayer robot) {
	        if (robot.getPosition() == null)
	            return null;

	        return robot.getPosition().getX() + "," + robot.getPosition().getY() + "," + robot.getPosition().getDirectionEnum().toString();
	    }
}
