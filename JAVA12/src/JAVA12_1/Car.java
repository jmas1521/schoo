package JAVA12_1;
public class Car {
	protected String N;
	protected int W;
	protected int H;
	protected int L;
	protected int T;
	protected String C;
	protected String MY;
	protected double x;
	protected double y;
	protected double F;
	Car(String name,int width,int heigth,int length,String coler,String myno,double fuel){
		N=name; W=width; H=heigth; L=length; C=coler; MY=myno;x=y=0;F=fuel;
	}
	public void putSpec() {
		System.out.println("名前："+N);
		System.out.println("車幅："+W+"mm");
		System.out.println("車高："+H+"mm");
		System.out.println("車長："+L+"mm");
		System.out.println("色："+L+"mm");
		System.out.println("ナンバー："+MY);
	}
	double getX() {return x;}
	double getY() {return y;}
	double getFuel() {return F;}
	boolean move(double dx,double dy) {
		double dist=Math.sqrt(dx*dx+dy*dy);
		if (dist>F)
			return false;
		else {
			F-=dist;
			x+=dx;
			y+=dy;
			return true;
		}
	}
}
