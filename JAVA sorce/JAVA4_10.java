import java.util.Scanner;
class JAVA4_10{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("何個＊を表示しますか。");int x=stdIn.nextInt();
		for (int y=0;y<x;y++)
		System.out.print('*');
	}
}