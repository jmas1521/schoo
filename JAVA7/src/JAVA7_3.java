import java.util.Scanner;
public class JAVA7_3 {
	static int med(int x,int y,int z) {
		int t=0;
		if (x>y) {
			t=x;
			x=y;
			y=t;
		}
		if(y>z) {
			t=y;
			y=z;
			z=t;
		}
		if(x>y) {
			t=x;
			x=y;
			y=t;
		}
		return y;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		int []a=new int[3];
		for (int y=0;y<3;y++) {
			System.out.print("値"+(y+1)+":");
			a[y]=stdIn.nextInt();
		}
		System.out.print("値１，２，３の中央値："+med(a[0],a[1],a[2]));
	}

}
