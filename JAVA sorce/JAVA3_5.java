import java.util.Scanner;
class JAVA3_5{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.println("整数値："+x);
		if (x>0)
		if (x%5==0)
		System.out.println("その値は5で割り切れます。");
		else
		System.out.println("その値は5で割り切れません。");
		else
		System.out.println("正ではない値が入力されました。");
	}
}
