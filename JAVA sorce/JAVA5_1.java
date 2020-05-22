import java.util.Scanner;
class JAVA5_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数：");
		int x=stdIn.nextInt();
		System.out.printf("8進数は%oです。\n",x);
		System.out.printf("16進数は%Xです。\n",x);
	}
}