import java.util.Scanner;
import java.util.Random;
public class JAVA7_23 {
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
	static int H3(int[]a,int x) {
		int z=0;
		for (int y=0;y<a.length;y++) {
			if (a[y]==x) {
				z++;
			}
		}
		return z;
	}
	static int[] arraySrchidx(int []a,int x) {
		int []b=new int[H3(a,x)];
		for (int y=0,c=0;y<a.length;y++) {
			if (a[y]==x) {
				b[c]=y;
				c++;
			}
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
		System.out.print("\n1~10の中でどの値を格納したインデックスを抽出しますか？：");
		int y=stdIn.nextInt();
		if (H3(a,y)!=0) {
		System.out.println("メソッドarraySrchidxで作成した配列を表示");
		int[]b=arraySrchidx(a,y);
		System.out.print("配列arraySrchidx={");
		H2(b);
		}
		else {
			System.out.println("抽出する値がありません。");
		}
	}

}
