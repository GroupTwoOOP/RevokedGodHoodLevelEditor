package tiles;

import greenfoot.Greenfoot;

public class Wood extends Tile{
	/**
	 * 
	 */
	private static final long serialVersionUID = 11L;
	public Wood(){
		image = "Images/water.jpg";
		id = 11;
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
