import java.util.Scanner;
import java.util.Random;
public class JAVA7_25 {
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
	static int[] arrayRmvOfN(int []a,int idx,int n) {
		int []b=new int[a.length-n];
		for (int y=0,z=0;y<b.length;y++) {
		if (y>=idx) {
			b[y]=a[idx+n+z];
			z++;
		}
		else {
			b[y]=a[y];
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
		System.out.print("\n配列aの中でどのインデックスを指定しますか？：");
		int y=stdIn.nextInt();
		System.out.print("指定したインデックスから何個を消去する（指定したインデックスも含む0~"+(x-y)+"）？：");
		int z=stdIn.nextInt();
		if(z!=0&&z!=x) {
		System.out.println("メソッドarrayRmvOfNで作成した配列を表示");
		int[]b=arrayRmvOfN(a,y,z);
		System.out.print("配列arrayRmvOfN={");
		H2(b);
		}
		else if(z==0){
			System.out.print("消去数０なので配列は変わりません");
		}
		else if(z==x) {
			System.out.println("すべて消去しているので配列はありません。");
		}
	}

}
