package JAVA10_5;
import java.util.Scanner;
public class JAVA10_5 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
			System.out.print("�������`�F");String x=stdIn.next();
			System.out.print("�����ԍ�");String y=stdIn.next();
			System.out.print("�a���c��");long z=stdIn.nextInt();
			Account xxx=new Account(x,y,z);
		System.out.println("�������`"+xxx.getName());
		System.out.println("�����ԍ�"+xxx.getNo());
		System.out.println("�a���c��"+xxx.getBalance());
		System.out.println("���ʔԍ�"+xxx.getId());
		System.out.print("�������`�F");String a=stdIn.next();
		System.out.print("�����ԍ�");String b=stdIn.next();
		System.out.print("�a���c��");long c=stdIn.nextInt();
		Account aaa=new Account(a,b,c);
	System.out.println("�������`"+aaa.getName());
	System.out.println("�����ԍ�"+aaa.getNo());
	System.out.println("�a���c��"+aaa.getBalance());
	System.out.println("���ʔԍ�"+aaa.getId());
	}

}
