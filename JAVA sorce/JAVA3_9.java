import java.util.Scanner;
class JAVA3_9{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値X："); int x=stdIn.nextInt();
		System.out.print("整数値Y："); int y=stdIn.nextInt();
		int z=x>y?x:y;
		if (x==y)
		System.out.println("同じ値です。");
		else
		System.out.println("大きい方の値は"+z+"です。");
	}
}