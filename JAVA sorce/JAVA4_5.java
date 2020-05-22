import java.util.Scanner;
class JAVA4_5{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("カウントダウンします。");
		int x;
		do{
			System.out.println("正の整数値：");
			x=stdIn.nextInt();
		} while (x<=0);
		while(x>=0){
			System.out.print(--x);
		}
		//（Xに５を代入）x--か--xで表記する時点で-1が出る。また、x--は5から、--xは４からスタートする。
	}
}
