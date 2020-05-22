import java.util.Scanner;
class JAVA4_12{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("カウントアップします。");
		int x;
		do {
			System.out.print("整数値：");
			x=stdIn.nextInt();
		} while(x<=0);
		for (int y=0;y<=x-1;y++)
		System.out.print(y+",");
		System.out.print(x);
	}
}
		
			