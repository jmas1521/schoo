import java.util.Scanner;
class JAVA4_13{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("1����x�܂ł̘a�����߂܂��B");
		int x;
		do {
			System.out.print("�����l�F");
			x=stdIn.nextInt();
		} while (x<=0);
		int y=1,sum=0;
		for (;y<=x;sum+=y,y++);
		System.out.println("1����"+x+"�܂ł̘a��"+sum+"�ł��B");
	}
}
