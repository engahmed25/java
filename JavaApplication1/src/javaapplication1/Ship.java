/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Mcs
 */
public class Ship {
    /**
	 * A boolean value specifying if this ship is vertical, this ship horizontal if false.
	 */
	public boolean isVertical = true;
	
	/**
	 * An integer value specifying the type of this ship.
	 */
	public int type;
	
	/**
	 * An integer value specifying the amount of health of this ship.
	 */
	private int health;
	
	/**
	 * Constructs a ship of the specified type and orientation
	 * @param type An integer value specifying the type of this ship
	 * @param vertical A boolean value specifying if this ship is vertical, this ship horizontal if false
	 */
	public Ship(int type, boolean vertical) {
		this.isVertical = vertical;
		this.type = type;
		this.health = type;
	}
	
	/**
	 * Returns a boolean value specifying if this ship has any health left, false if it does not have any left.
	 * @return A boolean value specifying if this ship has any health left
	 */
	public boolean alive() {
		if(health > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Decrements the health of this ship if it is hit.
	 */
	public void hit() {
		health--;
	}
}
    

