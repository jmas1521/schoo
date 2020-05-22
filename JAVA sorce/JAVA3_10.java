import java.util.Scanner;
class JAVA3_10{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値X："); int x=stdIn.nextInt();
		System.out.print("整数値Y："); int y=stdIn.nextInt();
		int z=x>y?x-y:y-x;
		if (x==y)
		System.out.println("二つの整数値の差は0です。");
		else 
		System.out.println("二つの整数値の差は"+z+"です。");
	}
}
