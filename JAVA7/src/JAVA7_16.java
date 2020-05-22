import java.util.Scanner;
import java.util.Random;
public class JAVA7_16 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static int minOf(int []a) {
	 int min=0;
		for(int y=0;y<a.length;y++) {
			if (y!=0) {
				if (min>=a[y]) {
					min=a[y];
				}
			}
			else {
				min=a[y];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("０～９までの値を格納する配列aの要素数：");
		final int x=stdIn.nextInt();;
		int []a=new int[x];
		for (int j=0;j<x;j++){
			a[j]=rand.nextInt(10);
		}
		System.out.print("配列aのすべての要素を表示｛");
		for (int j=0;j<x;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("}");
		System.out.println("配列aの最小値は"+minOf(a)+"です。");
	}

}
