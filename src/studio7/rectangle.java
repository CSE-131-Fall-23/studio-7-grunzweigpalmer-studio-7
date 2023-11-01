package studio7;

public class rectangle {
	
	//Instance variables
	
	private double length;
	private double width;
	
	
	//constructor
	
	public rectangle(double initLength, double initWidth) {
		this.length = initLength;
		this.width = initWidth;
	}
	
	public rectangle(double initSideLength) {
		this.length = initSideLength;
		this.width = initSideLength;
	}
	
	
	public rectangle() {
		this.length = 0;
		this.width = 0;
	}
	
	
	//getters
	
	public double length(rectangle x) {
		return length;
	}
	
	public double width(rectangle x) {
		return width;
	}
	
	
	
	

	//methods
	
	public double area(rectangle x) {
		
		double answer = (length(x) * width(x));
		
		return answer;
	}
	
	public double perimeter(rectangle x) {
		return (2 * length(x)) + (2*width(x));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
