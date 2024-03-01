package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Tree extends MovelessObstacles{
	
	GamePanel gp;
	 
	
	public Tree(GamePanel gp, int scale) {
		this.scale = scale;
		this.gp = gp;
		getPlayerImage();
		
	}
	
	public Tree(GamePanel gp) {
		// constructorlarda da bu sekilde method overloading yapilabilir.
		this.gp = gp;
		getPlayerImage();
		
	}
	
	public void getPlayerImage() {
          try { 
			
			wintertree = ImageIO.read(getClass().getResourceAsStream("/player/wintertree.png"));
			summertree = ImageIO.read(getClass().getResource("/player/summertree.png"));
			
			
			
	   }catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void drawWinterTree(Graphics2D g2) {
	     
		g2.drawImage(wintertree, getX(), getY(), originalTileSize * scale, originalTileSize * scale, null);
			
	}
	public void drawSummerTree(Graphics2D g2) {
		g2.drawImage(summertree, getX(), getY(), originalTileSize * scale, originalTileSize * scale, null);
	}

}
