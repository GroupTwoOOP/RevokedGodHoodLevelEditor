package primary;

import java.util.Scanner;

import tiles.Tile;

public class ConsoleIO implements Runnable{
	private final static Scanner scanLee = new Scanner(System.in);
	@Override
	public void run() {
		System.out.println("Welcome to the Revoked Godhood Level Editor!");
		System.out.println("Enter a tile id and click to place a tile.");
		System.out.println("If you require a list of Tile ids, enter a '?'");
		System.out.println("if you wish to exit, type 'exit'");
		for(;;){
			String input = scanLee.nextLine();
			try{
				int id = Integer.parseInt(input);
				Tile.tileType = id;
			}	
			catch (NumberFormatException nfe){
				if (input.equals("?")){
					System.out.println("0 Grass");
					System.out.println("1 Dirt");
					System.out.println("2 Water");
					System.out.println("3 Sand");
					System.out.println("4 Stone");
					System.out.println("5 leaves");
					System.out.println("6 Iron");
					System.out.println("7 Lava");
					System.out.println("8 Eihwaz");
					System.out.println("9 Kenaz");
					System.out.println("10 Fire");
					System.out.println("11 Wood");
					System.out.println("99 Void");
				}
				else if (input.equals("exit")){
					break;
				}
				else if (input.equals("save")){
					System.out.print("Enter a name for the saved chunk: ");
					String name = scanLee.nextLine();
					FileIO.saveChunk(name);
				}
				else if (input.equals("load")){
					System.out.print("Enter a name of a chunk to load: ");
					String name = scanLee.nextLine();
					new TileManager(FileIO.loadChunk(name));
				}
				else{
					System.out.println("That was not valid input");
				}
			}
		}
	}
}
