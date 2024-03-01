package entity;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Mountain extends MovelessObstacles{
	GamePanel gp;
	public Mountain(GamePanel gp) {
		this.gp = gp;
		getPlayerImage();
		
	}
	
	public void getPlayerImage() {
          try { 
			
		 summermountain = ImageIO.read(getClass().getResourceAsStream("/player/summermountain.png"));
			
			
			
	   }catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void draw(Graphics2D g2) {
	     
		g2.drawImage(summermountain, getX(), getY(), originalTileSize * scale, originalTileSize * scale, null);
		
	}
	

}
