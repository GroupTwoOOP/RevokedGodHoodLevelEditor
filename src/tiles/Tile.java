package tiles;

import java.awt.Color;
import java.io.Serializable;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

public abstract class Tile extends Actor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 100L;
	protected final static int tileSize = 15;
	protected int id;
	protected String image;
	public static int tileType;
	public int getID(){
		return id;
	}
	public static void removeTile(World world, Tile tile){
		world.removeObject(tile);
	}
	public static Tile getTileType(int id){
		Tile newTile = null;
		switch(id){
		case 0:
			newTile = new Grass();
			break;
		case 1:
			newTile = new Dirt();
			break;
		case 2:
			newTile = new Water();
			break;
		case 3:
			newTile = new Sand();
			break;
		case 4:
			newTile = new Stone();
			break;
		case 5:
			newTile = new Leaves();
			break;
		case 6:
			newTile = new Iron();
			break;
		case 7:
			newTile = new Lava();
			break;
		case 8:
			newTile = new Eihwaz();
			break;
		case 9:
			newTile = new Kenaz();
			break;
		case 10:
			newTile = new Fire();	
			break;
		case 11:
			newTile = new Wood();
			break;
		case 99:
			newTile = new Void();
			break;
			default:
				System.out.println("invalid tile id used");
		}
		return newTile;
	}
	public void updateTexture(){
		setImage(image);
		getImage().scale(tileSize, tileSize);
	}
}
