package com.codetest.robotgame.board;

import com.codetest.robotgame.rules.BoardGameRules;
public abstract class AbstractGameBoard implements GameBoard {
	
	BoardGameRules boardGameRules = new BoardGameRules();
	public BoardGameRules getGameRules() {
		return boardGameRules;
	}
	public void setGameRules(BoardGameRules boardGameRules) {
		this.boardGameRules = boardGameRules;
	}	
}
