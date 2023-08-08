/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Mcs
 */
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import view.Board;
import javaapplication1.Ship;
/**
 * Represents a cell on the board for this battleship game.
 * @author Miguel Perez
 * @author Jasmin Ramirez
 * @author Jason McDonald
 * @author Matthew Weigel
 * @author Erick Flores
 * @version 1.0
 */
public class Cell  extends Rectangle{
	/**
	 * A reference to a ship in this cell, otherwise it is null.
	 */
	public Ship ship = null;
	
	/**
	 * A boolean value specifying if this cell has been shot.
	 */
	public boolean shot = false;
	
	/**
	 * An integer value specifying the x coordinate of this cell.
	 */
	public int x = 0;
	
	/**
	 * An integer value specifying the y coordinate of this cell.
	 */
	public int y = 0;
	
	/**
	 * A reference to the board that contains this cell.
	 */
	private Board board;
	
	/**
	 * Constructs a cell with a reference to the specified board, and at the specified x and y coordinate
	 * @param b A reference to the board that contains this cell
	 * @param x An integer value specifying the x coordinate of this cell
	 * @param y An integer value specifying the y coordinate of this cell
	 */
	public Cell(Board b, int x, int y) {
		super(30,30);
		this.board = b;
		this.x = x;
		this.y = y;
		setFill(Color.CYAN);
		setStroke(Color.DARKCYAN);
	}
	/**
	 * Takes a shot at a cell, returns true if it contains a ship, false otherwise.
	 * @return A boolean value specifying if this cell contains a ship
	 */
	public boolean takeShot() {
		shot = true;
		setFill(Color.DARKGRAY);
		setStroke(Color.DARKCYAN);
		
		if(ship != null ) {
			ship.hit();
			setFill(Color.DARKRED);
			setStroke(Color.ORANGERED);
			if(!ship.alive()) {
				board.setNumShips(board.getNumShips() - 1);
			}
			return true;
		}
		return false;
	}
	
	/**
	 * Returns the cell above the current cell if it is valid, otherwise returns null.
	 * @return A reference to the cell to be returned
	 */
	

	/**
	 * Returns a boolean value specifying if this cell is valid.
	 * @param x An integer value specifying the x coordinate of this cell
	 * @param y An integer value specifying the y coordinate of this cell
	 * @return A boolean value specifying if this cell is valid
	 */
	public boolean isValid(int x, int y){
		return board.isValid(x, y);
	}
	
	/**
	 * Returns a reference to this cell's ship.
	 * @return A reference to this cell's ship
	 */
	public Ship getShip(){
		return this.ship;
	}
}