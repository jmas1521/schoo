import java.util.Scanner;
class JAVA4_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int a;
		do{
			System.out.print("整数値："); int x=stdIn.nextInt();
			if (x>0)
			System.out.print("その値は正です。");
			else if (x<0)
			System.out.print("その値は負です。");
			else
			System.out.print("その値は0です。");
			System.out.println("もう一度？\nYES－１\nNO－０");
			a=stdIn.nextInt();
		}while (a==1);
	}
}
			