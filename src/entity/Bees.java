package entity;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Bees extends DynamicObstacles{
GamePanel gp;
 
 
	
	public Bees(GamePanel gp) {
	
		this.gp = gp;
		getPlayerImage();
		setSpeed(5);
		getX();
		getY();
		this.scale = 3;
		
		
	}
	
	
	public void getPlayerImage() {
          try { 
			
			bee = ImageIO.read(getClass().getResourceAsStream("/player/bee.png"));
			
			
			
	   }catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void draw(Graphics2D g2) {
	     
		g2.drawImage(bee, getX(), getY(), originalTileSize * scale, originalTileSize * scale, null);
		
	}
	
	
	
	public void update() {
		
		
	}

}
