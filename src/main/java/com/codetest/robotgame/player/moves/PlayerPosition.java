package com.codetest.robotgame.player.moves;

public class PlayerPosition {

	int x;
    int y;
    DirectionsEnum direction;
    public PlayerPosition (int x, int y, DirectionsEnum direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    
    public PlayerPosition(PlayerPosition playerPosition) {
        this.x = playerPosition.getX();
        this.y = playerPosition.getY();
        this.direction = playerPosition.getDirectionEnum();
    }
    
    public int getX() {
        return this.x;
    }
	public int getY() {
        return this.y;
    }

    public DirectionsEnum getDirectionEnum() {
        return this.direction;
    }
    
    public void setDirectionEnum(DirectionsEnum direction) {
        this.direction = direction;
    }
	
    public void change(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }
    
	
	
//	private Direction rotate(int step) {
//
////    	System.out.println("this.directionIndex..."+ this.directionIndex);
////    	System.out.println("map.size()..."+ map.size());
//        int newIndex = (this.directionIndex + step) < 0 ?
//                map.size() - 1 :
//                (this.directionIndex + step) % map.size();
////               System.out.println("newIndex:" + newIndex);
////               System.out.println("testing..."+ (this.directionIndex + step) % map.size());
//        return Direction.valueOf(newIndex);
//    }
}
