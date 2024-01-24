    import java.awt.*;
	import java.awt.event.KeyEvent;
	import javax.swing.ImageIcon;
	
public class Knight {
	
			int x, dx = 10, y, dy = 7, score;
			ImageIcon i;
			Image m ;
			Character p;

			public Knight() {
				i=new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\monster.gif");
				m=i.getImage();
				
				x = 200;
				y = 600;
			}
			public void setx(int x){
				this.x=x;
				}
				public void sety(int y){
				this.y=y;
				}

			public void MoveX(){ 
				//dx=10;
				if(x < 1900 && x > 1800)
					dx = -5;
				if(x > -5 && x < 40)
					dx = 5;	
					x = x + dx;
				
				}
			public void moveY(){
				if(y > 900)
					dy = -5;
				if(y <= 100)
					dy = +5;
				y = y + dy;
				
			}

			public int getX() {
				return x;
			}

			public int getY() {
				return y;
			}

			public Image getImage() {
				return m;
			}

			public int getScore(){
				return score;
			}
			public void setScore(int score){
				this.score=score;
				
			}
			public void setImageIcon(ImageIcon resim){
				i=resim;
				
			}
		}
