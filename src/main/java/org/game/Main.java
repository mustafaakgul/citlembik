    import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStream;

	import javax.swing.*;
	import javax.xml.stream.events.StartDocument;
	import sun.audio.*;

	public class Main extends JFrame {
	
		Graphics g;
		private JTextField id=new JTextField(8);
		private JButton greenButton = new JButton("Yeşil");
		private JButton redButton=new JButton("Kırmızı");
		private JButton blueButton=new JButton("Mavi");
		private JCheckBox voice=new JCheckBox("Voice");
		private JButton play = new JButton("PLAY");
		private JButton quit = new JButton("QUIT");	
		private Listen listen=new Listen();
		private JFrame start = new JFrame("Citlembik");
		private JFrame gui2 = new JFrame("Citlembik");
		public JFrame game = new JFrame();
		private JFrame gameover = new JFrame();
		private JButton restart=new JButton("RESTART");
		
		
		public Character character=new Character();
		Player player=new Player(character);
		public void GUI1(){	
		
			start.setVisible(true);
			start.setSize(800,375);
			start.setLocationRelativeTo(null);
			start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			start.setLayout(new FlowLayout());		
			JLabel bgn2=new JLabel(new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\5.jpg"));		
			bgn2.setLayout(new FlowLayout());
			start.add(bgn2);		
			
			JPanel panel1 = new JPanel(new FlowLayout());
			JPanel panel2 = new JPanel(new FlowLayout());													
			panel1.add(play);		
			panel1.add(quit);						
			bgn2.add(panel1,BorderLayout.CENTER);
			bgn2.add(panel2,BorderLayout.NORTH);
			
			play.addActionListener((ActionListener) listen);
			quit.addActionListener(listen);
				
			
		}

		public void GUI2(){
			
			gui2.setSize(1280,720);
			gui2.setLocationRelativeTo(null);
			gui2.setVisible(true);
			gui2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui2.setLayout(new FlowLayout());
			JLabel background=new JLabel(new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\4.jpg"));
			background.setLayout(new FlowLayout());
			gui2.add(background);
			
			JPanel pnl1=new JPanel(new FlowLayout());
			pnl1.add(new JLabel("ID:"));
			pnl1.add(id);
			Color c2=new Color(0,0,0);
			id.setForeground(c2);
			

			JPanel pnl2=new JPanel();
			pnl2.setLayout(new FlowLayout());
			
			Color c1 = new Color(0,255,0);
			greenButton.setBackground(c1);

			Color c3 = new Color(255, 0,0);
			redButton.setBackground(c3);
			
			Color c4=new Color(0,0,255);
			blueButton.setBackground(c4);

			pnl2.add(greenButton);
			pnl2.add(redButton);
			pnl2.add(blueButton);

			JPanel pnl3=new JPanel(new FlowLayout());
			
			pnl3.add(voice);
								
			background.add(pnl1);
			background.add(pnl2);
			background.add(pnl3);		
			
			greenButton.addActionListener(listen);
			redButton.addActionListener(listen);
			blueButton.addActionListener(listen);
			voice.addActionListener(listen);
		}
		
		public void GAME(){
		
			Board b=new Board();
			
			game.setTitle("Citlembik");
			game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			game.setSize(1920,1080);
			game.setVisible(true);
			game.setLocationRelativeTo(null);
			game.add(new Board());
				 	
		}
		
		public void GAMEOVER(){
			game.setVisible(false);
			
			gameover.setTitle("Citlembik");
			gameover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gameover.setSize(1920,1080);
			gameover.setVisible(true);
			gameover.setLocationRelativeTo(null);
			JLabel background=new JLabel(new ImageIcon("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\sky.jpg"));
			background.setLayout(new FlowLayout());
			gameover.add(background);
			background.add(restart);
			background.add(quit);
			restart.addActionListener(listen);
			quit.addActionListener(listen);
		}
		 
		public static void main(String[] args) {
			   Main m=new Main();
			    m.GUI1();
			
			   }
		public class Listen implements ActionListener {
			public void actionPerformed (ActionEvent e){
			
				String id2=id.getText();
				//System.out.println(id2);

				if(e.getSource()== play){
					start.setVisible(false);
					GUI2();
					
				}
				if(e.getSource()== greenButton){
					 character.setColor("green");
					gui2.setVisible(false);
					player.setID(id2);
					try {
						player.print();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					GAME();
					
				}
				else if(e.getSource()== redButton){
					 character.setColor("red");
					gui2.setVisible(false);
					player.setID(id2);
					try {
						player.print();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					GAME();
					
				}
				else if(e.getSource()== blueButton){
					 character.setColor("blue");
					gui2.setVisible(false);
					player.setID(id2);
					try {
						player.print();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					GAME();
				}
				else if(e.getSource()== quit){
					start.setVisible(false);
					gameover.setVisible(false);
				}
				else if(e.getSource()== restart){
					gameover.setVisible(false);
					GAME();
				}

			}


		}
	}