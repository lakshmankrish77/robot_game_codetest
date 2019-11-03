package com.codetest.robotgame.player.moves;

import java.util.HashMap;
import java.util.Map;

public enum DirectionsEnum {

	    NORTH(0), EAST(1), SOUTH(2), WEST(3);
	    private static Map<Integer, DirectionsEnum> map = new HashMap<Integer, DirectionsEnum>();
	    private int directionIndex;

	    static {
	        for (DirectionsEnum directionsEnum : DirectionsEnum.values()) {
	            map.put(directionsEnum.directionIndex, directionsEnum);
	        }
	    }
	    
	    private DirectionsEnum(int direction) {
	        this.directionIndex = direction;
	    }
	    
	    public static DirectionsEnum valueOf(int directionNum) {
	        return map.get(directionNum);
	    }

	    public DirectionsEnum leftDirection() {
	        return rotate(-1);
	    }

	    public DirectionsEnum rightDirection() {
	        return rotate(1);
	    }

	    private DirectionsEnum rotate(int step) {

//	    	System.out.println("this.directionIndex..."+ this.directionIndex);
//	    	System.out.println("map.size()..."+ map.size());
	        int newIndex = (this.directionIndex + step) < 0 ?
	                map.size() - 1 :
	                (this.directionIndex + step) % map.size();
//	               System.out.println("newIndex:" + newIndex);
//	               System.out.println("testing..."+ (this.directionIndex + step) % map.size());
	        return DirectionsEnum.valueOf(newIndex);
	    }
	    
		
}

