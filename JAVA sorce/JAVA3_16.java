import java.util.Scanner;
class JAVA3_16{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値A："); int x=stdIn.nextInt();
		System.out.print("整数値B："); int y=stdIn.nextInt();
		System.out.print("整数値C："); int z=stdIn.nextInt();
		int a;
		if (x>y){a=x; x=y; y=a;}
		if (y>z){a=y; y=z; z=a;}
		if (x>y){a=x; x=y; y=a;}
		System.out.println("昇順："+x+"→"+y+"→"+z+"です。");
	}
}
