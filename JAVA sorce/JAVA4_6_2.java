import java.util.Scanner;
class JAVA4_6_2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do{
		System.out.print("何個＊を表示しますか。");
		 x=stdIn.nextInt();
		}while (x<1);
		
	int y=1;
		while (y<=x){
			System.out.print('*');
			y++;
		}
		System.out.println();
	}
}