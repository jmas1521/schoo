import java.util.Scanner;
class JAVA3_5{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.println("�����l�F"+x);
		if (x>0)
		if (x%5==0)
		System.out.println("���̒l��5�Ŋ���؂�܂��B");
		else
		System.out.println("���̒l��5�Ŋ���؂�܂���B");
		else
		System.out.println("���ł͂Ȃ��l�����͂���܂����B");
	}
}
