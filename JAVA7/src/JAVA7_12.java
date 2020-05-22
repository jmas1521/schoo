import java.util.Scanner;
public class JAVA7_12 {
	static void bit(int y) {
		for (int x=31;x>=0;x--) {
			System.out.print(((y>>x)&1)==1?'1':'0');
		}
		System.out.println("");
	}
	static int rRotate(int x,int n) {
		int a=0;
		a=x>>>n;
		x=x<<32-n;
		a=a|x;
		return a;
	}
	static int lRotate(int x,int n) {
		int a=0;
		a=x<<n;
		x=x>>>32-n;
		a=a|x;
		return a;
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数a：");
		int a=stdIn.nextInt();
		System.out.print("整数a:"+a+"のビット＝");
		bit(a);
		System.out.print("何回転しますか？");
		int b=stdIn.nextInt();
		int c;
		do {
		System.out.print("どちらに回転させますか？＜右・・１/左・・０>");
		c=stdIn.nextInt();
	}while (c!=1&&c!=0);
		if (c==1) {
			System.out.println("右に"+b+"回転した値："+rRotate(a,b));
			bit(rRotate(a,b));
		}
		else {
			System.out.println("左に"+b+"回転した値："+lRotate(a,b));
			bit(lRotate(a,b));
		}
	}
}
