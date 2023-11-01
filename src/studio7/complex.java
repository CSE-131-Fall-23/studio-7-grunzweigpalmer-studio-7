package studio7;

public class complex {

	
	private double real;
	private double imaginary;
	
	//constructor
	
	public complex(double initreal, double initimaginary) {
		this.real = initreal;
		this.imaginary = initimaginary;
	}
	
	//getter
	
	public double getReal(complex x) {
		return this.real;
	}
	
	public double getImaginary(complex x) {
		return this.imaginary;
	}
	
	//methods
	
	public complex sum(complex x, complex y) {
		double sumReal = x.real + y.real;
		double sumImaginary = x.imaginary + y.imaginary;
		complex sum = new complex(sumReal, sumImaginary);
		return sum;
	}
	
	
	
}
