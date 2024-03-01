package entity;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Birds extends DynamicObstacles{

GamePanel gp;
	
	public Birds(GamePanel gp) {
	
		this.gp = gp;
		getPlayerImage();
		setSpeed(5);
		this.scale = 3;
	}
	
	public void getPlayerImage() {
          try { 
			
			bird = ImageIO.read(getClass().getResourceAsStream("/player/bird.png"));
			
			
			
	   }catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void draw(Graphics2D g2) {
	     
		g2.drawImage(bird, getX(), getY(), originalTileSize * scale, originalTileSize * scale, null);
		
	}
	
}
