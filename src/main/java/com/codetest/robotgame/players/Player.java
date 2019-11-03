package com.codetest.robotgame.players;

import com.codetest.robotgame.player.moves.PlayerPosition;

public interface Player {

	 public boolean setPosition (PlayerPosition position);	 
	 public PlayerPosition getPosition();	 
	 public boolean move(PlayerPosition newPosition);
	 
	 
}
