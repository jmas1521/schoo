import java.util.Scanner;
import java.util.Random;
public class JAVA7_30 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static void H(int []x) {
		for (int y=0;y<x.length;y++) {
			x[y]=rand.nextInt(10)+1;
		}
	}
	static void H2(int []x) {
		for (int y=0;y<x.length;y++) {
			if(y==x.length-1) {
				System.out.print(x[y]+"}");
			}
			else {
				System.out.print(x[y]+",");
			}
		}
	}
	static int min(int[]a) {
		int x=0;
		for (int y=0;y<a.length;y++) {
			if(y==0) {
				x=a[y];
			}
			if (x>a[y]) {
				x=a[y];
			}
		}
		return x;
	}
	static int min(int a,int b) {
		return a>b?b:a;
	}
	static int min(int a,int b,int c) {
		int t=0;
		if (a>b) {
			t=a;
			a=b;
			b=t;
		}
		if (b>c) {
			t=b;
			b=c;
			c=t;
		}
		if (a>b) {
			t=a;
			a=b;
			b=t;
		}
		return a;
	}
	public static void main(String[] args) {
		System.out.print("配列aの要素数：");
		int x=stdIn.nextInt();
		int []a=new int[x];
		System.out.println("1~10の値をランダムに格納した配列を表示");
		System.out.print("配列a={");
		H(a);
		H2(a);
		System.out.println("");
		System.out.println("配列aの最小値："+min(a));
		System.out.print("整数a:");
		int y=stdIn.nextInt();
		System.out.print("整数b:");
		int z=stdIn.nextInt();
		System.out.print("整数c:");
		int b=stdIn.nextInt();
		System.out.println("整数a,bの最小値："+min(y,z));
		System.out.println("整数a,b,cの最小値："+min(y,z,b));
	}

}
