import java.util.Scanner;
import java.util.Random;
class JAVA6_15{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		String []a={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		String []b={"���j��","�Ηj��","���j��","�ؗj��","���j��","�y�j��","���j��"};
		System.out.println("���F�p��ŗj���𓖂ĂĂ��������B\n�i�������ŉ𓚂��Ă��������j");
		int x,z=-1,c;
		do {
			x=rand.nextInt(7);
			if (x!=z){
		for (String y;;){
			System.out.print(b[x]+":");
			 y=stdIn.next();
			if (y.equals(a[x])){
				break;
			}
			System.out.println("�Ⴂ�܂��B");
		}
		System.out.println("�����ł�");
			}
			if (x!=z){
				z=x;
				System.out.print("�����܂����H/YES���P�FNO���O");
				c=stdIn.nextInt();
			}
			else {
				c=1;
			}
		}while (c==1);
	}
}
			