package primary;

import java.util.List;

import tiles.*;
import tiles.Void;


public class TileManager {
	private static Tile[][] tiles = new Tile[World.getW()][World.getH()];
	private Chunk chunk;
	public TileManager(){
		chunk = new Chunk();
		Tile[][] tileMap = chunk.tileMap;
		for (int x = 0; x < World.getW(); x++){
			for (int y = 0; y < World.getH(); y++){
				tiles[x][y] = tileMap[x][y];
				World.getWorld().addObject(tiles[x][y], x, y);
			}
		}
	}
	public TileManager(Chunk loadChunk){
		List<Tile> oldTiles = World.getWorld().getObjects(Tile.class);
		for (Tile t : oldTiles){
			World.getWorld().removeObject(t);
		}
		Tile[][] tileMap = loadChunk.tileMap;
		for (int x = 0; x < World.getW(); x++){
			for (int y = 0; y < World.getH(); y++){
				tiles[x][y] = tileMap[x][y];
				tiles[x][y].updateTexture();
				World.getWorld().addObject(tiles[x][y], x, y);
			}
		}
	}
	public static Tile[][] getTiles(){
		Tile[][] newTiles = new Tile[World.getW()][World.getH()];
		for (int x = 0; x < World.getW(); x++){
			for (int y = 0; y < World.getH(); y++){
				newTiles[x][y] = (Tile) World.getWorld().getObjectsAt(x, y, Tile.class).get(0);
			}
		}
		return newTiles;
	}
}	
