package crapsGame;
import java.util.*;

public class Cube {
	
	private static Random rand = new Random();
	private int eyes;
	
	public Cube(){
		roll();
	}
	
	public int getEyes() {
		return eyes;
	}
	
	public void roll() {
		eyes = rand.nextInt(6) + 1;
		}

	@Override
	public String toString() {
		return "Cube [eyes=" + eyes + "]";
	}
	
	

}
