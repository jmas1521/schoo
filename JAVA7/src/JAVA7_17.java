import java.util.Scanner;
import java.util.Random;
public class JAVA7_17 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static int linearSearchR(int []a,int key) {
		int y=0;
		for (int i=0;i<a.length;i++){
		if (a[i]==key){
			y=i;
		}
		}
		return y;
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
			System.out.print("探す値");
			int key=stdIn.nextInt();
			if ((linearSearchR(a,key))==0){
				System.out.println("その値はありません。");
			}
			else {
				System.out.println("それはa["+linearSearchR(a,key)+"]にあります");
			}
		}

		}
