package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import entity.Character;
import entity.*;
public class GamePanel extends JPanel implements Runnable{
	
	
	start2 start = new start2();
	Character character = new Character(this);
	ArrayList<DynamicObstacles> dO = new ArrayList<>();
	
	
	
	
	
	final int maxScreenCol = 20;
	final int maxScreenRow = 20;
	int fps = 60;
	Graphics2D g2;
	Thread gameThread;
	
	 Random random = new Random();
	 Location loc = new Location();
	 ArrayList<Integer> horizontal = new ArrayList<>();
	 ArrayList<Integer> vertical = new ArrayList<>();
	 
	 
	
	 public GamePanel() {
	    	this.setPreferredSize(new Dimension(start.width, start.length));
	    	this.setBackground(Color.DARK_GRAY);
	    	this.setDoubleBuffered(true);
	    	this.setFocusable(true);
	    	// placedMObstacles(tree, g2);
	    	//placingDynamicObstacles();
	    	
	        placing();
	       	
	    }
	 
        public void createHorAndVer() {
		 
		 for (int i = 0; i < maxScreenRow ; i ++) {
			 horizontal.add(i * (start.width / maxScreenRow));
		 }
		 for (int i = 0; i < maxScreenRow ; i ++) {
			 vertical.add(i * (start.length / maxScreenCol));
		 }
		 
		 
		 }
        public void doo(DynamicObstacles do1) {
   		 
         int x = random.nextInt(horizontal.size());
   		 int y = random.nextInt(vertical.size());
   		 do1.setDefaultValues(horizontal.get(x), vertical.get(y));
   		 horizontal.remove(x);
   		 vertical.remove(y);
   		 
   		 }
        
        public void placing() {
        	createHorAndVer();
        	 dO.add(new Bees(this));
    		 dO.add(new Birds(this));
    		 dO.add(new Bees(this));
    		
    		 for(DynamicObstacles d:dO) {
 		    	doo(d);
 		    	System.out.println(d.getX());
   			    System.out.println(d.getY());
 		    }
        }
        
        
	 
	 
	 // haritaya engel yerlestirme: 20 adet sabit engel her birinden en az iki tane olmali. sabit engeller: agac,duvar,kaya,dag
	 // uc adet hareketli engel.
	 // engel yerlestirme sirasi: ilk olarak hareketli engeller yani kus ve arilar yerlestirilmeli uc adet olacak sekilde.
	 // kusun yerlestirildigi nokta dahil on tane dikey kordinata bir engel yerlestirilmemeli
	 // arinin yerlestirildigi nokta dahil alti tane yatay koordinata bir engel yerlestirilmemeli.
	 // kis ve yaz icin ayri ayri hareketsiz engel yerlestirme islemi yapilmali.
	 
	 
	 
	 
		
	
	 
	 
	 
	 
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		for(int i = 0; i < start.width; i+=start.width / maxScreenRow) {
			   g.drawLine(i, 0, i, start.length);
			
		}
		for(int i = 0; i < start.length; i+=start.length / maxScreenCol) {
			   g.drawLine(0, i+40, start.width, i+40);
			
		}
		
		
		
		character.draw(g2);
		//tree.drawSummerTree(g2);
		//wall.draw(g2);	
		//rock.draw(g2);
		//bird.draw(g2);
		 for(DynamicObstacles d:dO) {
		    	d.draw(g2);
		 }
		//mountain.draw(g2);
		
		 g2.dispose();
		 
	}
	
	public void startGameThread() {
    	gameThread = new Thread(this);
    	gameThread.start(); // this is gonna automatically call run method.
    }
	
	
	
	
	public void update() {
		// we change player position inside update method.
		dO.get(0).update();
	}
	
	
	@Override
	public void run() {
		
		double drawInterval = 1000000000 / fps;
    	double delta = 0;
    	long lastTime = System.nanoTime();
    	long currentTime;
    	long timer = 0;
    	int drawCount = 0;
    	
    	
    	
    	while(gameThread != null) {
    		
    		currentTime = System.nanoTime();
    		delta += (currentTime - lastTime) / drawInterval;
    		timer += (currentTime - lastTime);
    		lastTime = currentTime;
    		
    		if(delta >= 1) {
    			update();
        		repaint();
        		delta--;
        		drawCount++;	
    		}
    		if(timer >= 1000000000) {
    			System.out.println("fps: "+drawCount);
    			drawCount  = 0;
    			timer = 0;
    		}
    	}
		
	}

}
