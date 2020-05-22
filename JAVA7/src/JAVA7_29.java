import java.util.Random;
import java.util.Scanner;
public class JAVA7_29 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static void H(int [][]x) {
		for (int y=0;y<x.length;y++) {
			for (int z=0;z<x[y].length;z++) {
			x[y][z]=rand.nextInt(10)+1;
		}
		}
	}
	static void H2(int [][]x) {
		for (int y=0;y<x.length;y++) {
			for (int z=0;z<x[y].length;z++) {
				System.out.println("["+y+"]["+z+"]="+x[y][z]);
			}
	}
	}
	static int[][] aryClone2(int[][]a){
		int [][]b=new int[a.length][];
		for(int y=0;y<a.length;y++) {
			b[y]=new int[a[y].length];
		}
		for (int y=0;y<a.length;y++) {
			for (int z=0;z<a[y].length;z++) {
				b[y][z]=a[y][z];
			}
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.print("二次元配列aの要素：");
		int x=stdIn.nextInt();
		System.out.print("二次元配列aの要素数：");
		int y=stdIn.nextInt();
		int [][]a=new int[x][y];H(a);
		System.out.println("1~10の値をランダムに格納した配列を表示");
		System.out.println("二次元配列a");
		H2(a);
		System.out.println("aryClone2で生成した配列bを表示");
		int [][]b= aryClone2(a);
		H2(b);
	}

}
