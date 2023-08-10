import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Player {
	String id;
  Character c;
	public Player(Character character){
		this.id="";
		c=character;
	
	}
    
	public Player(String id,Character character) {
		this.id=id;
		c=character;
	}
   
    public void print() throws FileNotFoundException{
    	
    	File f=new File("C:\\Users\\Mustafa\\Desktop\\COMPUTER ENGINEERING\\SOFTWARE\\JAVA PROGRAMMING\\Citlembik\\Citlembik\\src\\Player.txt");
		PrintWriter p=new PrintWriter(f);
		//System.out.println(id);
		p.println(id);
		//System.out.println(c.getColor());
		p.println(c.getColor());
		p.close();
    }
	
	public void setID(String id) {
		this.id = id;
		//System.out.println(id);
		
	}
	public String getID(){
		return id;
	}
	
}