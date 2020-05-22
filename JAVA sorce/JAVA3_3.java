import java.util.Scanner;
class JAVA3_3{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.println("整数値："+x);
		if (x>0)
		System.out.println("その値は正の数です。");
		else if(x<0)
		System.out.println("その値は負の数です。");
		else if(x==0)
		System.out.println("その値は０です。");
	}
}//正常に処理される