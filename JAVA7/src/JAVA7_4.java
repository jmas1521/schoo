import java.util.Scanner;
public class JAVA7_4 {
static int sumUp(int n) {
	int sumUp=0;
	while(n-->0) {
		sumUp+=n;
	}
	return sumUp;
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		System.out.print("値：");
		int x=stdIn.nextInt();
System.out.print("1から"+x+"までの和："+sumUp(x));
	}

}
