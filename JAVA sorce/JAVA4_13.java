import java.util.Scanner;
class JAVA4_13{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("1からxまでの和を求めます。");
		int x;
		do {
			System.out.print("整数値：");
			x=stdIn.nextInt();
		} while (x<=0);
		int y=1,sum=0;
		for (;y<=x;sum+=y,y++);
		System.out.println("1から"+x+"までの和は"+sum+"です。");
	}
}
