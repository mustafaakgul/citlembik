	import java.awt.*;
	import java.awt.event.KeyEvent;
	import javax.swing.ImageIcon;

	public class Character {
		int x, dx, y, dy;
		Image citlembik;
		String color;


		public Character() {
			
		//	if(color.equals("blue")){
				ImageIcon i = new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\blue.gif");
				citlembik = i.getImage();	
		/*	}
			else if(color.equals("green")){
				ImageIcon i = new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\green.gif");
				citlembik = i.getImage();	
			}
			else if(color.equals("red")){
				ImageIcon i = new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\red.gif");
				citlembik = i.getImage();	
			}
			else if(true){
				ImageIcon i = new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\blue.gif");
				citlembik = i.getImage();
			}*/
		
			 x = 0;
			 y = 0;
		}

		public void horizontalMove() {
			x = x + dx;
		}
		public void verticalMove(){
			y = y + dy;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
		
		public void setColor(String color){
			this.color = color;
		}
		
		public String getColor(){
			return color;
		}

		public Image getImage() {
			return citlembik;
		}

		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			if (key == KeyEvent.VK_A)
				dx = -5;
			if (key == KeyEvent.VK_D)
				dx = 5;
			if (key == KeyEvent.VK_S)
				dy = 5;
			if (key == KeyEvent.VK_W)
				dy = -5;
		}

		public void keyReleased(KeyEvent e) {
			int key = e.getKeyCode();
			if (key == KeyEvent.VK_A)
				dx = 0;
			if (key == KeyEvent.VK_D)
				dx = 0;
			if (key == KeyEvent.VK_S)
				dy = 0;
			if (key == KeyEvent.VK_W)
				dy = 0;
		}

	}