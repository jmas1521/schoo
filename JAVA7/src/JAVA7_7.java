import java.util.Scanner;
public class JAVA7_7 {
	static void putChars(char c,int n) {
		while(n-->0) {
			System.out.print(c);
		}
	}
	static void putStars(int n) {
for (int x=1;x<=n;x++) {
	putChars('*',x);
	System.out.println("");
}
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Scanner stdIn=new Scanner(System.in);
	System.out.print("左下直角三角形を表示します\n段数：");
	int x=stdIn.nextInt();
	putStars(x);
	}

}
