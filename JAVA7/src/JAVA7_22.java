import java.util.Scanner;
import java.util.Random;
public class JAVA7_22 {
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
	static int[] arrayClon(int []a) {
		int []b=new int[a.length];
		for (int y=0;y<a.length;y++) {
			b[y]=a[y];
		}
		return b;
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
		System.out.println("メソッド arrayClonで作成した配列を表示");
		int[]b= arrayClon(a);
		System.out.print("配列 arrayClon={");
		H2(b);
	}

}
