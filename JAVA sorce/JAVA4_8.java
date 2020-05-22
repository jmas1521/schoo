import java.util.Scanner;
class JAVA4_8{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do {
			System.out.print("整数値："); x=stdIn.nextInt();
		} while (x<0);
		int y=1;
		while (x>=10){
				x/=10;
				y++;
			}
		System.out.println("入力値の桁数は"+y+"です。");
	}
}
			
			