import java.util.Scanner;
class JAVA4_22{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("�s���~�b�h��\�����܂��B");
		System.out.print("�i���F");
		int x=stdIn.nextInt();
		for (int y=1,b=1;y<=x;y++,b+=2){
			for (int z=x-y;z>0;z--){
					System.out.print(' ');
			}
			for (int a=b;a>0;a--){
				System.out.print('*');
			}
			System.out.println("");
		}
	}
}
		