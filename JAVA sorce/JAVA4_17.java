import java.util.Scanner;
class JAVA4_17{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値：");
		int x=stdIn.nextInt();
		int y=0;
		for (int z=1;z<=x;z++){
			if(x%z==0){
		System.out.println(z);
		y++;
			}
		}
		System.out.println("約数の数は"+y+"です。");
	}
}		