import java.util.Scanner;

class Exercise3_1{
	public static void main(String[] args){
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("�����l�F");
		int a=stdIn.nextInt();
		
		if (a>=0)
		System.out.println("���̐�Βl��"+a+"�ł��B");
		else
		System.out.println("���̐�Βl��"+(-a)+"�ł��B");
		
	}
}