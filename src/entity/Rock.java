package entity;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Rock extends MovelessObstacles{

	GamePanel gp;
	public Rock(GamePanel gp) {
		this.gp = gp;
		getPlayerImage();
		
	}
	
	public void getPlayerImage() {
          try { 
			
		 rock = ImageIO.read(getClass().getResourceAsStream("/player/rock.png"));
			
			
			
	   }catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void draw(Graphics2D g2) {
	     
		g2.drawImage(rock, getX(), getY(), originalTileSize * scale, originalTileSize * scale, null);
		
	}
	
	
}
