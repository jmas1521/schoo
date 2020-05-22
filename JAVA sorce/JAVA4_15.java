import java.util.Scanner;
class JAVA4_15{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		double y,z;
		do {
		System.out.print("何センチから");  x=stdIn.nextInt();
		System.out.print("何センチまで");  y=stdIn.nextInt();
		System.out.print("何センチごと");  z=stdIn.nextInt();
		}while (x<=0||y<=0||z<=0);
		System.out.println("身長　　標準体重");
		for (double a=x,b=(x-100)*9/10;y>=a;a+=z,b=(a-100)*9/10)
		System.out.println(a+"   "+b); 
	}
}