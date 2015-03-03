package tiles;

import greenfoot.Greenfoot;
import greenfoot.World;

import java.awt.Color;

public class Fire extends Tile {
	/**
	 * 
	 */
	private static final long serialVersionUID = 10L;
	public Fire(){
		image = "Images/fire.jpg";
		id = 10;
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
