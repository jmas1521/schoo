import java.util.Scanner;
import java.util.Random;
class JAVA2_8{
	public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	Random rand=new Random();
	int x=stdIn.nextInt();
	System.out.println("整数値："+x);
	int y=rand.nextInt(11)-5;
	System.out.println("その値±５のあたいを生成しました。");
	System.out.println("それは"+(x+y)+"です。");
	}
}
	