import java.util.Scanner;
class JAVA3_3{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.println("�����l�F"+x);
		if (x>0)
		System.out.println("���̒l�͐��̐��ł��B");
		else if(x<0)
		System.out.println("���̒l�͕��̐��ł��B");
		else if(x==0)
		System.out.println("���̒l�͂O�ł��B");
	}
}//����ɏ��������