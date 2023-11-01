package studio7;

public class die {

	private int numSides;
	
	//constructor
	public die(int initnumSides) {
		this.numSides = initnumSides;
	}
	
	public die() {
		this.numSides = 0;
	}
	
	public int numSides(die x) {
	return numSides;
}
	
	public int rollDie(die x) {
		return (int)(Math.random()*(numSides(x)-1)+1);
	}
}
