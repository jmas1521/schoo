import java.util.Scanner;
class JAVA3_6{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.println("�����l�F"+x);
		if (x>0)
		if (x%10==0)
		System.out.println("���̒l��10�̔{���ł��B");
		else
		System.out.println("���̒l��10�̔{���ł͂���܂���B");
		else
		System.out.println("���ł͂Ȃ��l�����͂���܂����B");
	}
}
