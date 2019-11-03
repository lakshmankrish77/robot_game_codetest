package com.codetest.robotgame.players;

import com.codetest.robotgame.player.moves.PlayerPosition;

public class RobotPlayer implements Player {

    private PlayerPosition position;

    public RobotPlayer() {
    }

    public RobotPlayer(PlayerPosition position) {
        this.position = position;
    }

    
    public boolean setPosition(PlayerPosition position) {
        if (position == null)
            return false;

        this.position = position;
        return true;
    }

        
    public boolean move(PlayerPosition newPosition) {
        if (newPosition == null)
            return false;

        // change position
        this.position = newPosition;
        return true;
    }

    public PlayerPosition getPosition() {
        return this.position;
    }

    public boolean rotateLeft() {
        if (this.position.getDirectionEnum() == null)
            return false;

        this.position.setDirectionEnum(this.position.getDirectionEnum().leftDirection());
        return true;
    }

    /**
     * Rotates 90 degrees to the RIGHT
     *
     * @return true 
     */
    public boolean rotateRight() {
        if (this.position.getDirectionEnum() == null)
            return false;

        this.position.setDirectionEnum(this.position.getDirectionEnum().rightDirection());
        return true;
    }

}
