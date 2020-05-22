import java.util.Scanner;
class JAVA4_21_3{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("右上側直角三角形を表示します。");
		System.out.print("段数は：");
		int x=stdIn.nextInt();
		for(int y=0;y<=x;y++){
			for (int z=1;z<=y;z++){
				System.out.print(' ');
			}
			for (int a=x-y;a>=1;a--){
					System.out.print('*');
					}
			System.out.println("");
		}
	}
}