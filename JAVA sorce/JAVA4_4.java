import java.util.Scanner;
class JAVA4_4{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		do{
			System.out.println("���̐����l�F");
			x=stdIn.nextInt();
		} while (x<=0);
		while(x>=0){
			System.out.print(","+x);
			x--;
		}
		System.out.print("���ۂ�X�F"+x);
	}
}
