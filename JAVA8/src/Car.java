
public class Car {
private String name;
private int width;
private int heigth;
private int length;
private double x;
private double y;
private double fuel;
private double tank;
Car(String name,int width,int heigth,int length,double fuel){
	this.name=name; this.width=width; this.heigth=heigth; this.length=length;
	this.fuel=fuel; x=y=0.0;
}
double getX() {return x;}
double getY() {return y;}
double getFuel() {return fuel;}
void putSpec() {
	System.out.println("���O�F"+name);
	System.out.println("�ԕ��F"+width+"mm");
	System.out.println("�ԍ��F"+heigth+"mm");
	System.out.println("�Ԓ��F"+length+"mm");
}
boolean move(double dx,double dy) {
	double dist=Math.sqrt(dx*dx+dy*dy);
	if (dist>fuel)
		return false;
	else {
		fuel-=dist;
		x+=dx;
		y+=dy;
		return true;
	}
}
void supply(double x) {
	fuel=x+fuel;
}
}
