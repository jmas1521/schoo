import java.util.Scanner;
class JAVA4_12{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("�J�E���g�A�b�v���܂��B");
		int x;
		do {
			System.out.print("�����l�F");
			x=stdIn.nextInt();
		} while(x<=0);
		for (int y=0;y<=x-1;y++)
		System.out.print(y+",");
		System.out.print(x);
	}
}
		
			