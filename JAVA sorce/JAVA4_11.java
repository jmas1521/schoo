import java.util.Scanner;
class JAVA4_11{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�J�E���g�_�E�����܂��B");
		int x;
		do {
			System.out.print("�����l�F");
			x=stdIn.nextInt();
		} while(x<=0);
		for (;x>=0;x--)
		System.out.println(x);
	}
}