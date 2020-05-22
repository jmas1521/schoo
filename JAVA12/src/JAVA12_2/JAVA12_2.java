package JAVA12_2;
import java.util.Scanner;
public class JAVA12_2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("a‚ÌAccount");
		System.out.print("ŒûÀ–¼‹`a");String x=stdIn.next();
		System.out.print("ŒûÀ”Ô†a");String y=stdIn.next();
		System.out.print("—a‹àŽc‚a");long A=stdIn.nextLong();
		System.out.print("’èŠú—a‹àa");long B=stdIn.nextLong();
		System.out.println("b‚ÌAccount");
		System.out.print("ŒûÀ–¼‹`b");String xx=stdIn.next();
		System.out.print("ŒûÀ”Ô†b");String yy=stdIn.next();
		System.out.print("—a‹àŽc‚b");long AA=stdIn.nextLong();
		System.out.println("c‚ÌAccount");
		System.out.print("ŒûÀ–¼‹`c");String xxx=stdIn.next();
		System.out.print("ŒûÀ”Ô†c");String yyy=stdIn.next();
		System.out.print("—a‹àŽc‚c");long AAA=stdIn.nextLong();
		System.out.print("’èŠú—a‹àc");long BBB=stdIn.nextLong();
			 TimeAccount a=new TimeAccount(x,y,A,B);
			 Account b=new Account(xx,yy,AA);
			 TimeAccount c=new TimeAccount(xxx,yyy,AAA,BBB);
			 System.out.println("a‚Æb‚Ì‘å¬ŠÖŒWi“¯‚¶‚È‚ç0,a>b‚È‚ç1,a<b‚È‚ç-1j"+TimeAccount.compbalance(a, b));
			 System.out.println("a‚Æc‚Ì‘å¬ŠÖŒWi“¯‚¶‚È‚ç0,a>c‚È‚ç1,a<c‚È‚ç-1j"+TimeAccount.compbalance(a, c));
			 System.out.println("b‚Æc‚Ì‘å¬ŠÖŒWi“¯‚¶‚È‚ç0,b>c‚È‚ç1,b<c‚È‚ç-1j"+TimeAccount.compbalance(b, c));
	}
}
