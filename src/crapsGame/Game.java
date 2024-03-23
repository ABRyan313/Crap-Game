package crapsGame;

public class Game {
	
	private int numberOfPlays;
	
	public Game(int numberOfPlays) {
		this.numberOfPlays = numberOfPlays;
	}
	
	

	public void play() {
		
		String text = null;
		Cup cup = new Cup(2);
		
		for (int i = 0; i < numberOfPlays; i++) {
			cup.toss();
		int result = 0;
		try {
			result = cup.getCube(0).getEyes() + cup.getCube(1).getEyes();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("Play " + (i + 1) + ": " + result);
		}
		
		switch (text) {
		
		case "7":
		case "11":
			System.out.println("The player has won");
			break;
			
		case "2":
		case "3":
		case "12":
			System.out.println("the house has won");
			break;
			
			
			
		
		}
	}

}
