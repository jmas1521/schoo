import java.util.Scanner;
class JAVE2_4{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.println("整数値："+x);
		System.out.println("10を加えた数は"+(x+10)+"です。");
		System.out.println("10を引いた数は"+(x-10)+"です。");
	}
}
		