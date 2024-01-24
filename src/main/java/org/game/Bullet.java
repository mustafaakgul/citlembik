    import java.awt.*;
	import java.awt.event.KeyEvent;
	import javax.swing.ImageIcon;
	
public class Bullet {
	
			int x, dx = 2, y, dy = 0,score=0;
			
			ImageIcon i;
			
			Image m ;

			public Bullet(){
				i = new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\g.gif");
				m = i.getImage();
				
				
				x = 1920;
				y = 0;
			}

			public void horizontalMove() {
				x = x - dx;
				if(x == 0)
					x = 1920;
			}
			public void speed(){
				
				
			}
			
			

			public int getX() {
				return x;
			}

			public int getY() {
				return y;
			}
			public void setX(int x){
				this.x = x;
			}
			public void setY(int y){
				this.y = y;
			}

			public Image getImage() {
				return m;
			}

			public int getScore(){
				return score;
			}
			public void setScore(int score){
				this.score = score;
				
			}
			public void setImageIcon(ImageIcon resim){
				i = resim;
				
			}
			
		}