
import javax.swing.*;

import java.awt.*;

public class Testt extends JFrame {
	
	public Testt(){
		this.setTitle("f");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		g.drawRect(40, 40, 30, 30);
		g.setColor(Color.RED);
		g.drawOval(40, 40, 30, 30);
	}
	public static void main(String[] args) {
		new Testt();
	}

}
