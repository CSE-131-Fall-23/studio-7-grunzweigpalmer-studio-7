package studio7;

public class fraction {

	
	
	private double numerator;
	private double denominator;
	
	//constructor
	
	public fraction() {
		this.numerator = 1;
		this.denominator = 1;
	}
	
	
	public fraction(double initnumerator, double initdenominator) {
		this.numerator = initnumerator;
		this.denominator = initdenominator;
	}
	
	//getter
	
	public double getNumerator(fraction x) {
		return numerator;
	}
	
	public double getDenominator(fraction x) {
		return denominator;
	}
	
	//setter
	
	public void setNumerator(fraction x, int num) {
		this.numerator = num;
	}
	
	public void setDenominator(fraction x, int den) {
		this.denominator = den;
	}
	
	
	
	//methods
	
	public fraction multiply(fraction x, fraction y) {
		fraction answer = new fraction((getNumerator(x)*getNumerator(y)), (getDenominator(x)*getDenominator(y)));
		return answer;
	}
	
	public fraction reciprocate(fraction x) {
		fraction reciprocal = new fraction(getDenominator(x), getNumerator(x));
		return reciprocal;
	}
	

	}


	
	
	

