package JAVA10_3;
import java.util.Scanner;
import java.util.Random;
public class JAVA10_3 {
	public static void main(String[] args) {
		 Scanner stdIn=new Scanner(System.in);
		 Random rand=new Random();
		 System.out.print("整数a：");
		 int b=stdIn.nextInt();
		 System.out.print("整数b：");
		 int y=stdIn.nextInt();
		 System.out.print("整数c：");
		 int z=stdIn.nextInt();
		System.out.print("０～９までの値を格納する配列aの要素数：");
		final int x=stdIn.nextInt();
		int []a=new int[x];
		for (int j=0;j<x;j++){
			a[j]=rand.nextInt(10);
		}
		System.out.print("配列aのすべての要素を表示｛");
		for (int j=0;j<x;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("}");
		MinMax xxx=new MinMax(b,y,z,a);
		System.out.println("配列aの最小値は"+xxx.minOf()+"です。");
		System.out.println("配列aの最大値は"+xxx.maxOf()+"です。");
		System.out.println("整数aと整数bの最小値は"+xxx.min2()+"です。");
		System.out.println("整数aと整数bの最大値"+xxx.max2()+"です。");
		System.out.println("整数aと整数bと整数cの最小値は"+xxx.min1()+"です。");
		System.out.println("整数aと整数bと整数cの最大値は"+xxx.max1()+"です。");
}
}