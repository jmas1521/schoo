import java.util.Scanner;
import java.util.Random;
class JAVA4_2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		int x=rand.nextInt(89)+10;
		System.out.println("10~99�̐��l�𓖂ĂĂˁI");
		int a;
		do{
			System.out.println("�������ȁH");
			 a=stdIn.nextInt();
			if (a>x)
			System.out.println("�����Ə�����������I");
			else if (a<x)
			System.out.println("�����Ƒ傫��������I");
		} while (a !=x);
		System.out.println("�����ł��B");
	}
}
			