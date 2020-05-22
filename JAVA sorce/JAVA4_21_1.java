import java.util.Scanner;
class JAVA4_21_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("左上側直角三角形を表示します。");
		System.out.print("段数は：");
		int x=stdIn.nextInt();
		for(int y=1;y<=x;y++){
			for (int z=y;z>=y;z--){
				for (int a=x-y;a>=0;a--){
					System.out.print('*');
					}
				System.out.print(' ');
				}
			System.out.println("");
		}
	}
}