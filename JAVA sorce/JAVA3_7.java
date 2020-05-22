import java.util.Scanner;
class JAVA3_7{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		int y=x%3;
		System.out.println("整数値："+x);
		if (x>0)
		if (x%3==0)
		System.out.println("その値は３で割り切れます。");
		else 
		System.out.println("その値は3で割った余りは"+y+"です。");
		else 
		System.out.println("正ではない値が入力されました。");
	}
}
