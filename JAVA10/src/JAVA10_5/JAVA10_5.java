package JAVA10_5;
import java.util.Scanner;
public class JAVA10_5 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
			System.out.print("口座名義：");String x=stdIn.next();
			System.out.print("口座番号");String y=stdIn.next();
			System.out.print("預金残高");long z=stdIn.nextInt();
			Account xxx=new Account(x,y,z);
		System.out.println("口座名義"+xxx.getName());
		System.out.println("口座番号"+xxx.getNo());
		System.out.println("預金残高"+xxx.getBalance());
		System.out.println("識別番号"+xxx.getId());
		System.out.print("口座名義：");String a=stdIn.next();
		System.out.print("口座番号");String b=stdIn.next();
		System.out.print("預金残高");long c=stdIn.nextInt();
		Account aaa=new Account(a,b,c);
	System.out.println("口座名義"+aaa.getName());
	System.out.println("口座番号"+aaa.getNo());
	System.out.println("預金残高"+aaa.getBalance());
	System.out.println("識別番号"+aaa.getId());
	}

}
