import java.util.Scanner;
class JAVA3_10{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����lX�F"); int x=stdIn.nextInt();
		System.out.print("�����lY�F"); int y=stdIn.nextInt();
		int z=x>y?x-y:y-x;
		if (x==y)
		System.out.println("��̐����l�̍���0�ł��B");
		else 
		System.out.println("��̐����l�̍���"+z+"�ł��B");
	}
}
