package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class DynamicObstacles extends Location{

	final int originalTileSize = 16;
	int scale = 4;
	int tileSize = originalTileSize * scale;
	

	public DynamicObstacles() {
		
	}
	
	public void setDefaultValues(int x, int y) {
		super.setDefaultValues(x, y);
	}

	public void draw(Graphics2D g2) {
		
		
	}

	public void update() {
		
		
	}

	
}
