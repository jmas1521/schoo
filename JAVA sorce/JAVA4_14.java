import java.util.Scanner;
class JAVA4_14{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("1����x�܂ł̘a�����߂܂��B");
		int x;
		do {
			System.out.print("�����l�F");
			x=stdIn.nextInt();
		} while (x<=0);
		System.out.print("1");
		int y=2,sum=1;
		for (;y<=x;sum+=y,y++)
		System.out.print("+"+y);
		System.out.println("="+sum);
		System.out.print("1����"+x+"�܂ł̘a��"+sum+"�ł��B");
	}
}