import java.util.Scanner;
class JAVA3_2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		System.out.println("����A:"+x);
		System.out.println("����B:"+y);
		int z=x/y;
		if (x==z*y)
		System.out.println("����A�͐���B�̖񐔂ł��B");
		else
		System.out.println("����A�͐���B�̖񐔂ł͂���܂���B");
	}
}