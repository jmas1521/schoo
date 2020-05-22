import java.util.Scanner;
class JAVA3_12{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値A："); int x=stdIn.nextInt();
		System.out.print("整数値B："); int y=stdIn.nextInt();
		System.out.print("整数値C："); int z=stdIn.nextInt();
		int A=x;
		if (A>y) A=y;
		if (A>z) A=z;
		System.out.print("最小値："+A);
	}
}
 