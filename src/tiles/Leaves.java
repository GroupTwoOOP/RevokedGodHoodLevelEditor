package tiles;

import greenfoot.Greenfoot;
import greenfoot.World;

import java.awt.Color;

public class Leaves extends Tile{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	public Leaves(){
		image = "Images/leaves.jpg";
		id = 5;
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
