import java.util.Scanner;
class JAVA4_25_2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("���������Z���܂��B");
		System.out.print("�����Z���܂����H");
		 int x=stdIn.nextInt();
		double sum=0;
		double z=0;
		for (int i=0;i<x;i++){
			System.out.print("����");
			int y=stdIn.nextInt();
			if (sum+y>1000){
				System.out.println("���v���P�O�O�O�𒴂��܂����B");
				System.out.println("�Ō�̐��l�͖������܂��B");
				break;
			}
			sum+=y;
			z++;
		}
		double a=sum/z;
		System.out.println("���v��"+sum+"�A���ς�"+a+"�ł��B");
	}
}
			