import java.util.Scanner;
class JAVA4_6_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do{
		System.out.print("������\�����܂����B");
		 x=stdIn.nextInt();
		}while (x<1);
		
	int y=0;
		while (y<x){
			System.out.print('*');
			y++;
		}
		System.out.println();
	}
}