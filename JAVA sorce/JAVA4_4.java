import java.util.Scanner;
class JAVA4_4{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("カウントダウンします。");
		int x;
		do{
			System.out.println("正の整数値：");
			x=stdIn.nextInt();
		} while (x<=0);
		while(x>=0){
			System.out.print(","+x);
			x--;
		}
		System.out.print("実際のX："+x);
	}
}
