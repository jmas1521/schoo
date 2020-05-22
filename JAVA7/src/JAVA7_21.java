import java.util.Scanner;
import java.util.Random;
public class JAVA7_21 {
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
static void aryExchng(int[]a,int[]b) {
	int x=(a.length<=b.length?a.length:b.length);
	for (int y=0,z=0;y<x;y++) {
		z=a[y];
		a[y]=b[y];
		b[y]=z;
	}
}
	public static void main(String[] args) {
		System.out.print("配列aの要素数：");
		int x=stdIn.nextInt();
		System.out.print("配列bの要素数：");
		int y=stdIn.nextInt();
		int []a=new int[x];
		int[]b=new int[y];
		System.out.println("1~10の値をランダムに格納した配列を表示");
		System.out.print("配列a={");
		H(a);
		H2(a);
		System.out.println("");
		System.out.print("配列b={");
		H(b);
		H2(b);
		System.out.println("");
		System.out.println("要素数の小さい方分だけ先頭から要素を入れ替えた配列を表示");
		aryExchng(a,b);
		System.out.print("配列a={");
		H2(a);
		System.out.println("");
		System.out.print("配列b={");
		H2(b);
	}
}
