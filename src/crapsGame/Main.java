package crapsGame;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		 
		while(true) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter how many times you wanna play");
		int times = sc.nextInt();
		
		Game game = new Game(times);
		game.play();
		 
		 if(times == 0)
			 System.out.println("program terminated");
			 break;
		 
		}
		
	

	}

}
