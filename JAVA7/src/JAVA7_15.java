import java.util.Scanner;
import java.util.Random;
public class JAVA7_15 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static int sumOf(int []a) {
	 int sum=0;
		for(int y=0;y<a.length;y++) {
			sum+=a[y];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("０〜９までの値を格納する配列aの要素数：");
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
		System.out.println("配列aの合計は"+sumOf(a)+"です。");
	}

}
