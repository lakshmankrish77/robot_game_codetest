package com.codetest.robotgame.board;

import com.codetest.robotgame.rules.BoardGameRules;

public interface GameBoard {
	
	public void setGameRules (BoardGameRules boardGameRules);
	public BoardGameRules getGameRules();
//    public boolean isValidPosition(Position position);

}