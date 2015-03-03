package tiles;

import java.awt.Color;

import greenfoot.Greenfoot;
import greenfoot.World;

public class Grass extends Tile {
	/**
	 * 
	 */
	private static final long serialVersionUID = 0L;
	public Grass(){
		image = "Images/grass.jpg";
		id = 0;
		this.setImage(image);
		this.getImage().scale(tileSize, tileSize);
	}
	public void act(){
		if(Greenfoot.mouseClicked(this)){
			System.out.println();
			getWorld().addObject(getTileType(tileType), getX(), getY());
			removeTile(getWorld(), this);
		}
	}
}
