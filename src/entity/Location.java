package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import main.GamePanel;

public class Location {

	private int x, y;
	private int speed;
	GamePanel gp;
	
	public BufferedImage character,rock,wintertree,summertree,wall,bird,bee,wintermountain,summermountain;
	// it describes an image with an accesible buffer of image data(we use this to store our image files.)
	//public String direction;
	public int spriteCounter = 0;
	public int spriteNumber = 1;
	
	
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setDefaultValues(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	// private alanlara getter setter metodlari ile erisebiliyoruz bu isleme encapsulation denir. setter degeri ekler getter degeri getirir.
	// burada rastgele koordinatlara engelleri yerlestirmek icin rastgele x ve y degerlerini iceren bir dizi tutup set metodu ile koordinatlarini ayarlamak mantikli bir yaklasim olabilir.
	// mesela bir degerimiz kisitlanmak istenirse negatif degerler alamayacak olsun diyelim set metodunda bunu gerceklesitiriyoruz.
	// engellerin boyutunu belirlemek icin constructor kullanilabilir. game panel de yer alan agac uzerinde kullandim bu yontemi ve ise yaradi bu sayede projede istenen sekilde farkli boyutlarda objeler olusturabiliriz.
	// super anahtar kelimesi miras aldigimiz classin constructor idir. superclass ta yer alan bir metodu override etmek istersek amm o metoda sadece bir sey eklemek istersek mesela super.metodAdi(); yazip daha sonra eklemek istediklerimizi ekleyebiliriz.
	
	
}
