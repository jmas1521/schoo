import java.util.Scanner;
class JAVA3_6{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.println("整数値："+x);
		if (x>0)
		if (x%10==0)
		System.out.println("その値は10の倍数です。");
		else
		System.out.println("その値は10の倍数ではありません。");
		else
		System.out.println("正ではない値が入力されました。");
	}
}
