import java.util.Scanner;
class JAVA4_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int a;
		do{
			System.out.print("�����l�F"); int x=stdIn.nextInt();
			if (x>0)
			System.out.print("���̒l�͐��ł��B");
			else if (x<0)
			System.out.print("���̒l�͕��ł��B");
			else
			System.out.print("���̒l��0�ł��B");
			System.out.println("������x�H\nYES�|�P\nNO�|�O");
			a=stdIn.nextInt();
		}while (a==1);
	}
}
			