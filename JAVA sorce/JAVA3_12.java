import java.util.Scanner;
class JAVA3_12{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����lA�F"); int x=stdIn.nextInt();
		System.out.print("�����lB�F"); int y=stdIn.nextInt();
		System.out.print("�����lC�F"); int z=stdIn.nextInt();
		int A=x;
		if (A>y) A=y;
		if (A>z) A=z;
		System.out.print("�ŏ��l�F"+A);
	}
}
 