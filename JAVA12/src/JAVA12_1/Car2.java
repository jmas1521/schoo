package JAVA12_1;
import java.lang.Math;
public class Car2 extends Car {
protected double sum;
	Car2(String name, int width, int heigth, int length, String coler, String myno, double fuel) {
		super(name, width, heigth, length, coler, myno, fuel);sum=0;
	}
	public double move2() {
		sum=Math.sqrt(x*x+y*y);
		return sum;
	}
	
	
}

