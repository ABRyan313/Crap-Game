package crapsGame;

import java.util.Arrays;

public class Cup {
	
	private Cube [] arr;
	
	public Cup(int n) {
		arr = new Cube[n];
		for(int i = 0; i < arr.length; i++)
			arr[i] = new Cube();
		
	}
	
	public void toss() {
		for(int i=0;i<arr.length;i++)
			arr[i].roll();
	}
	
	public int count() {
		return arr.length;
	}
	
	public Cube getCube(int n) throws Exception{
		
		if (n > 0 && n <= arr.length) {
		return arr[n];
		}
		
		else 
			throw new Exception("check condition");
	}

	@Override
	public String toString() {
		return "Cup [arr=" + Arrays.toString(arr) + "]";
	}

}
