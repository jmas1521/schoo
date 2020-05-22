import java.util.Scanner;
class JAVA3_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.println("整数値："+x);
		if (x>=0)
		System.out.println("絶対値は"+x+"です。");
		else if(x<0)
		System.out.println("絶対値は"+x*-1+"です。");
	}
}