package JAVA12_2;
import java.util.Scanner;
public class JAVA12_2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("a��Account");
		System.out.print("�������`a");String x=stdIn.next();
		System.out.print("�����ԍ�a");String y=stdIn.next();
		System.out.print("�a���c��a");long A=stdIn.nextLong();
		System.out.print("����a��a");long B=stdIn.nextLong();
		System.out.println("b��Account");
		System.out.print("�������`b");String xx=stdIn.next();
		System.out.print("�����ԍ�b");String yy=stdIn.next();
		System.out.print("�a���c��b");long AA=stdIn.nextLong();
		System.out.println("c��Account");
		System.out.print("�������`c");String xxx=stdIn.next();
		System.out.print("�����ԍ�c");String yyy=stdIn.next();
		System.out.print("�a���c��c");long AAA=stdIn.nextLong();
		System.out.print("����a��c");long BBB=stdIn.nextLong();
			 TimeAccount a=new TimeAccount(x,y,A,B);
			 Account b=new Account(xx,yy,AA);
			 TimeAccount c=new TimeAccount(xxx,yyy,AAA,BBB);
			 System.out.println("a��b�̑召�֌W�i�����Ȃ�0,a>b�Ȃ�1,a<b�Ȃ�-1�j"+TimeAccount.compbalance(a, b));
			 System.out.println("a��c�̑召�֌W�i�����Ȃ�0,a>c�Ȃ�1,a<c�Ȃ�-1�j"+TimeAccount.compbalance(a, c));
			 System.out.println("b��c�̑召�֌W�i�����Ȃ�0,b>c�Ȃ�1,b<c�Ȃ�-1�j"+TimeAccount.compbalance(b, c));
	}
}
