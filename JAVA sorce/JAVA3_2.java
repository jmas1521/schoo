import java.util.Scanner;
class JAVA3_2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		System.out.println("整数A:"+x);
		System.out.println("整数B:"+y);
		int z=x/y;
		if (x==z*y)
		System.out.println("整数Aは整数Bの約数です。");
		else
		System.out.println("整数Aは整数Bの約数ではありません。");
	}
}