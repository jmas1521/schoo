import java.util.Scanner;
class JAVA3_13{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����lA�F"); int x=stdIn.nextInt();
		System.out.print("�����lB�F"); int y=stdIn.nextInt();
		System.out.print("�����lC�F"); int z=stdIn.nextInt();
		int a;
		if (x>y){
			a=x; x=y; y=a;
		}
		if (y>z){
			a=y; y=z; z=a;
		}
		if (x>y){
			a=x; x=y; y=a;
		}
		System.out.print("	�����l�F"+y);
	}
}