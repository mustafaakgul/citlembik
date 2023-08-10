import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.TimerTask;

import javax.swing.*;

public class Board extends JPanel implements ActionListener {
	
	Character character=new Character();
	public Image background,img2;
	Timer time,timeblack;
	int a=1,b=1,c;
	int counter=0;
	boolean control = false;
	Monster pink;
	
	Random r1=new Random();
	Knight knight;
	Bullet bullet1,bullet2,bullet3,bullet4,bullet5;
	private  boolean live=true;

	private ImageIcon bgn;
	private ImageIcon back;
	JPanel pnl=new JPanel(new BorderLayout());
	JLabel lblcount=new JLabel("PUAN :");
	JLabel lblcount2=new JLabel();
	Main m=new Main();

	public Board() {
		pink=new Monster();
		knight=new Knight();
		addKeyListener(new AL());
		setFocusable(true);
		JPanel p=new JPanel();
		p.setBackground(Color.blue);
		p.add(lblcount);
		lblcount.setBackground(Color.blue);
		lblcount2.setBackground(Color.blue);
		p.add(lblcount2);
		add(p,BorderLayout.NORTH);
		

		JLabel background=new JLabel(new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\sky.jpg"));
		background.setLayout(new FlowLayout());
		add(background);
		

	/*	ImageIcon bgn = new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\sky.jpg");
		background = bgn.getImage();*/
		
	/*	ImageIcon bgn = new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\pink.gif");
		img = bgn.getImage();*/
		
		bullet1=new Bullet();
		bullet2=new Bullet();
		bullet3=new Bullet();
		bullet4=new Bullet();
		bullet5=new Bullet();
		bullet1.setY(100);
        bullet2.setY(300);
        bullet3.setY(500);
        bullet4.setY(700);
        bullet5.setY(900);

		timeblack=new Timer(1,this);
		timeblack.start();
		
		time = new Timer(50,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
		
			}
		});
		 java.util.Timer time1 = new java.util.Timer();
		 time1.scheduleAtFixedRate(new TimerTask() {
			  public void run() {
				/*  bullet1.horizontalMove();
			        bullet2.horizontalMove();
			        bullet3.horizontalMove();
			        bullet4.horizontalMove();
			        bullet5.horizontalMove();*/
				//	Random r1=new Random();
					a=r1.nextInt(9);
					b=r1.nextInt(5);
					/*System.out.println("x = "+(a*240)+" "
							+ "y = "+((b*120))); */
					//System.out.println((a*240)+" ve "+((a*240)+240)+" veve "+);
					//System.out.println(getX()+" "+getY());
				/*	if((a*240)<=p.getX() && p.getX()<=(a*240+177) && (b*120)<=p.getY() && p.getY()<=(b*120+100)){
					counter++;
					}
					System.out.println(counter);*/
					isControl();
					
			  }
			}, (long)1500,(long) 1500);
	}

	public void actionPerformed(ActionEvent e) {
		  		        
        bullet1.horizontalMove();
        bullet2.horizontalMove();
        bullet3.horizontalMove();
        bullet4.horizontalMove();
        bullet5.horizontalMove(); 
        
        c=r1.nextInt(3);
        if(c==0)
    	    knight.MoveX();
        if(c==1)
    	    knight.moveY();
    	if(c==2){
    	   	knight.MoveX();
        	knight.moveY();
    	    }
        
		lblcount2.setText(String.valueOf(getCounter()));
		
		character.horizontalMove();
		character.verticalMove();
		repaint();
		//System.out.println(p.getX()+" "+p.getY());
		if((a*240)<=character.getX() && character.getX()<=(a*240+100) && (b*120)<=character.getY() && character.getY()<=(b*120+61)){
			control = true;
		}
		
		if(knight.getX()-50<=character.getX() && character.getX()<=knight.getX()+57 && knight.getY()<=character.getY() && character.getY()<=knight.getY()+45){
			System.out.println("carpti1");
			live =false;
			timeblack.stop();
			m.game.setVisible(false);
			m.GAMEOVER();
			}
		
		if(bullet1.getX()-50<=character.getX() && character.getX()<=bullet1.getX()+57 && bullet1.getY()<=character.getY() && character.getY()<=bullet1.getY()+45){
			System.out.println("carpti1");
			live =false;
			timeblack.stop();
			m.game.setVisible(false);
			m.GAMEOVER();
			}
		
		if(bullet2.getX()-50<=character.getX() && character.getX()<=bullet2.getX()+57 && bullet2.getY()<=character.getY() && character.getY()<=bullet2.getY()+45){
			System.out.println("carpti2");
			live =false;
			timeblack.stop();
			m.game.setVisible(false);
			m.GAMEOVER();
			}
		
		if(bullet3.getX()-50<=character.getX() && character.getX()<=bullet3.getX()+57 && bullet3.getY()<=character.getY() && character.getY()<=bullet3.getY()+45){
			System.out.println("carpti3");
			live =false;
			timeblack.stop();
			m.game.setVisible(false);
			m.GAMEOVER();
			}
		
		if(bullet4.getX()-50<=character.getX() && character.getX()<=bullet4.getX()+57 && bullet4.getY()<=character.getY() && character.getY()<=bullet4.getY()+45){
			System.out.println("carpti4");
			live =false;
			timeblack.stop();
			m.game.setVisible(false);
			m.GAMEOVER();
			
			}
		
		if(bullet5.getX()-50<=character.getX() && character.getX()<=bullet5.getX()+57 && bullet5.getY()<=character.getY() && character.getY()<=bullet5.getY()+45){
			System.out.println("carpti5");
			live =false;
			timeblack.stop();
			m.game.setVisible(false);
			m.GAMEOVER();
			
			}

		//System.out.println(counter);
	}

	public void isControl(){
		if(control){
			counter++;
			//System.out.println(counter);a
		}
		control=false;

	}

	/*public void calculate(){

		if((a*240)<=p.getX() && p.getX()<=(a*240+177) && (b*120)<=p.getY() && p.getY()<=(b*120+100)){
			counter++;
			System.out.println(counter);
			}	
	}*/

	public int getCounter(){
		return counter;
	
	}

	public void paint(Graphics g) {

		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
	//	g2d.drawImage(img2,0,0, null);
	//	g2d.drawImage(img, (240*a), (120*b), null);
		g2d.drawImage(character.getImage(), character.getX(), character.getY(), null);
		g2d.drawImage(pink.getImage(), (240*a), (120*b), null);
		g2d.drawImage(background, 0, 0, null);		
		g2d.drawImage(knight.getImage(), knight.getX(), knight.getY(), null);
	//	g2d.drawImage(background, 0, 0, null);	
		
		g2d.drawImage(bullet1.getImage(),bullet1.getX() , bullet1.getY(), null);
		g2d.drawImage(bullet2.getImage(),bullet2.getX() , bullet2.getY(), null);
		g2d.drawImage(bullet3.getImage(),bullet3.getX() , bullet3.getY(), null);
		g2d.drawImage(bullet4.getImage(),bullet4.getX() , bullet4.getY(), null);
		g2d.drawImage(bullet5.getImage(),bullet5.getX() , bullet5.getY(), null);
		
	}

	private class AL extends KeyAdapter {
		public void keyReleased(KeyEvent e) {
			character.keyReleased(e);
		}

		public void keyPressed(KeyEvent e) {
			character.keyPressed(e);
		}
	}
}


