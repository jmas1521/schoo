import java.util.Scanner;
class JAVA3_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.println("�����l�F"+x);
		if (x>=0)
		System.out.println("��Βl��"+x+"�ł��B");
		else if(x<0)
		System.out.println("��Βl��"+x*-1+"�ł��B");
	}
}