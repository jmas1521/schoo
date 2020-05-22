import java.util.Scanner;
public class JAVA7_1 {
static int signOf(int n) {
	if(n>0) {
		return n=1;
	}
	else if(n<0){
		return n=-1;
	}
	else {
		return n=0;
	}
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		System.out.print("値：");
		int x=stdIn.nextInt();
		System.out.print("メソッドsignOfで評価した値："+signOf(x));

	}

}
