    import java.awt.*;
	import java.awt.event.KeyEvent;
	import javax.swing.ImageIcon;
	
public class Monster {

			int x, dx, y, dy,score=0;
			ImageIcon i;			
			Image m ;

			public Monster() {
				i=new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\pink.gif");
				m=i.getImage();
								
				x = 0;
				y = 0;
			}			
			public void setx(int x){
				this.x = x;
				}
			
			public void sety(int y){
				this.y = y;
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