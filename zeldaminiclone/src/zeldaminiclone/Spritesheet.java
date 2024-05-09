package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {

	public static BufferedImage spritesheet;
	public static BufferedImage[] player_front;
	public static BufferedImage tileWall;
	public static BufferedImage[] inimigo_front;
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		player_front = new BufferedImage[2];
		inimigo_front = new BufferedImage[2];
		
		player_front[0] = Spritesheet.getSprite(1, 11, 16, 16); 
		player_front[1] = Spritesheet.getSprite(16, 11, 16, 16);
		
		inimigo_front[0] = Spritesheet.getSprite(109, 224, 16, 16); 
		inimigo_front[1] = Spritesheet.getSprite(109+15, 224+16, 16, 16);
		tileWall = Spritesheet.getSprite(191, 185, 16, 16);
		}
	
		public static BufferedImage getSprite(int x, int y, int width, int height) {
			return spritesheet.getSubimage(x, y, width, height);
		}
	}