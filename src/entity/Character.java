package entity;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Character extends Location{
	
	
	final int originalTileSize = 16;
	final int scale = 4;
	int tileSize = originalTileSize * scale;

	
	GamePanel gp;
	public Character(GamePanel gp) {
		this.gp = gp;
		getPlayerImage();
		
	}
	
	public void getPlayerImage() {
          try { 
			
			character = ImageIO.read(getClass().getResourceAsStream("/player/characterr.png"));
			
			
			
	   }catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void draw(Graphics2D g2) {
		
		g2.drawImage(character, getX(), getY(), tileSize, tileSize, null);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
