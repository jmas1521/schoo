import java.util.Scanner;
public class JAVA7_11 {
static void bit(int y) {
	for (int x=31;x>=0;x--) {
		System.out.print(((y>>>x)&1)==1?'1':'0');
	}
	System.out.println("");
}
static int bit2(int x) {
	int z=1;
	for (int y=0;y<x;y++) {
		z*=2;
	}
	return z;
}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数a：");
		int a=stdIn.nextInt();
		System.out.print("整数a:"+a+"のビット＝");
		bit(a);
		System.out.print("指数b：");
		int b=stdIn.nextInt();
		int c=a*bit2(b);
		int d=a/bit2(b);
		System.out.print("整数aの２の"+b+"乗倍："+c+"のビット＝");
		bit(c);
		System.out.print("整数aの２の"+b+"乗分の１(小数点以下切り捨て)："+d+"のビット＝");
		bit(d);
	}

}
