import java.util.Scanner;
class JAVA4_21_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("���㑤���p�O�p�`��\�����܂��B");
		System.out.print("�i���́F");
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