import java.util.Scanner;
public class JAVA7_13 {
	static void bit(int y) {
		for (int x=31;x>=0;x--) {
			System.out.print(((y>>x)&1)==1?'1':'0');
		}
		System.out.println("");
	}
	static int set (int x,int pos) {
		int a=0,b=0;
		a=x>>>32-pos;
		b=a|1;
		b=b<<32-pos;
		a=x|b;
		return a;
	}
	static int reset (int x,int pos) {
		int a=0,b=0;
		a=~x;
		a=set(a,pos);
		b=~a;
		a=x&b;
		return a;
	}
	static int inverse(int x,int pos) {
		if (((x>>>32-pos)&1)==1) {
			return reset(x,pos);
		}
		else {
			return set(x,pos);
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数a：");
		int a=stdIn.nextInt();
		System.out.print("整数a:"+a+"のビット＝");
		bit(a);
		System.out.print("pos何番目(右端0番目～31番目):");
		int b=stdIn.nextInt();
		int d=32-b;
		int c;
		do {
		System.out.print("posの値をどうする？＜１にする・・１/０にする・・０/反転させる・・-1>");
		c=stdIn.nextInt();
	}while (c!=1&&c!=0&&c!=-1);
		if (c==1) {
			System.out.println("posの値を1にした値："+set(a,d));
			bit(set(a,d));
		}
		else if(c==0){
			System.out.println("posの値を0にした値："+reset(a,d));
			bit(reset(a,d));
		}
		else {
			System.out.println("posの値を反転した値："+inverse(a,d));
			bit(inverse(a,d));
		}
	}

}
