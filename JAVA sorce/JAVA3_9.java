import java.util.Scanner;
class JAVA3_9{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����lX�F"); int x=stdIn.nextInt();
		System.out.print("�����lY�F"); int y=stdIn.nextInt();
		int z=x>y?x:y;
		if (x==y)
		System.out.println("�����l�ł��B");
		else
		System.out.println("�傫�����̒l��"+z+"�ł��B");
	}
}