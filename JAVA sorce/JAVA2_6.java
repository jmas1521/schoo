import java.util.Scanner;
class JAVA2_6{
  public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
		System.out.println("三角形の面積を求めます。");
		double x=stdIn.nextDouble();
		double y=stdIn.nextDouble();
		System.out.println("底辺："+x);
		System.out.println("高さ："+y);
		System.out.println("面積は"+x*y/2+"です。");
	}
}