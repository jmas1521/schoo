import java.util.Scanner;
class JAVA4_26{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����H");
		int x=stdIn.nextInt();
		double sum=0;
		double y=0;
			for (int z=0;z<x;z++){
			System.out.print("�����F");
			int a=stdIn.nextInt();
				y++;
			if (a<0){
				System.out.println("���̒l�͉��Z���܂���B");
				y--;
				continue;
			}
			sum+=a;
		}
		double b=sum/y;
		System.out.print("���v��"+sum+"�A���ς�"+b+"�ł��B");
	}
}
		