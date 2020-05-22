import java.util.Scanner;
import java.util.Random;
class JAVA4_2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		int x=rand.nextInt(89)+10;
		System.out.println("10~99の数値を当ててね！");
		int a;
		do{
			System.out.println("いくつかな？");
			 a=stdIn.nextInt();
			if (a>x)
			System.out.println("もっと小さい数だよ！");
			else if (a<x)
			System.out.println("もっと大きい数だよ！");
		} while (a !=x);
		System.out.println("正解です。");
	}
}
			