import java.util.Scanner;
class JAVA3_7{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		int y=x%3;
		System.out.println("�����l�F"+x);
		if (x>0)
		if (x%3==0)
		System.out.println("���̒l�͂R�Ŋ���؂�܂��B");
		else 
		System.out.println("���̒l��3�Ŋ������]���"+y+"�ł��B");
		else 
		System.out.println("���ł͂Ȃ��l�����͂���܂����B");
	}
}
