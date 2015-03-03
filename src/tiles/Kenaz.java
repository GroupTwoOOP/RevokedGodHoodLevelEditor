package tiles;

import greenfoot.Greenfoot;
import greenfoot.World;

import java.awt.Color;

public class Kenaz extends Tile {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9L;
	public Kenaz(){
		image = "Images/kenaz.jpg";
		id = 9;
		this.setImage(image);
		this.getImage().scale(tileSize,tileSize);
	}
	public void act(){
		if(Greenfoot.mouseClicked(this)){
			System.out.println();
			getWorld().addObject(getTileType(tileType), getX(), getY());
			removeTile(getWorld(), this);
		}
	}
}
