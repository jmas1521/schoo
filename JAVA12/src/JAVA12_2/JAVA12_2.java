package JAVA12_2;
import java.util.Scanner;
public class JAVA12_2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("aのAccount");
		System.out.print("口座名義a");String x=stdIn.next();
		System.out.print("口座番号a");String y=stdIn.next();
		System.out.print("預金残高a");long A=stdIn.nextLong();
		System.out.print("定期預金a");long B=stdIn.nextLong();
		System.out.println("bのAccount");
		System.out.print("口座名義b");String xx=stdIn.next();
		System.out.print("口座番号b");String yy=stdIn.next();
		System.out.print("預金残高b");long AA=stdIn.nextLong();
		System.out.println("cのAccount");
		System.out.print("口座名義c");String xxx=stdIn.next();
		System.out.print("口座番号c");String yyy=stdIn.next();
		System.out.print("預金残高c");long AAA=stdIn.nextLong();
		System.out.print("定期預金c");long BBB=stdIn.nextLong();
			 TimeAccount a=new TimeAccount(x,y,A,B);
			 Account b=new Account(xx,yy,AA);
			 TimeAccount c=new TimeAccount(xxx,yyy,AAA,BBB);
			 System.out.println("aとbの大小関係（同じなら0,a>bなら1,a<bなら-1）"+TimeAccount.compbalance(a, b));
			 System.out.println("aとcの大小関係（同じなら0,a>cなら1,a<cなら-1）"+TimeAccount.compbalance(a, c));
			 System.out.println("bとcの大小関係（同じなら0,b>cなら1,b<cなら-1）"+TimeAccount.compbalance(b, c));
	}
}
