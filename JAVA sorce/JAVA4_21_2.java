import java.util.Scanner;
class JAVA4_21_2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("�E�������p�O�p�`��\�����܂��B");
		System.out.print("�i���́F");
		int x=stdIn.nextInt();
		for(int y=1;y<=x;y++){
			for (int a=x-y;a>=1;a--){
				System.out.print(' ');
			}
			for (int z=1;z<=y;z++){
					System.out.print('*');
					}
			System.out.println("");
		}
	}
}