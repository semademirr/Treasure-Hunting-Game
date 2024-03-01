package entity;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Wall extends MovelessObstacles{
	GamePanel gp;
	
	
	public Wall(GamePanel gp) {
		this.gp = gp;
		getPlayerImage();
		
	}
	
	public void getPlayerImage() {
          try { 
			
			wall = ImageIO.read(getClass().getResourceAsStream("/player/wall1.png"));
			
			
			
	   }catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void draw(Graphics2D g2) {
	     
		g2.drawImage(wall, getX(), getY(), originalTileSize * scale, originalTileSize * scale, null);
		
	}

}
