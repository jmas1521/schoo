import java.util.Scanner;
class JAVA3_15{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����lA�F"); int x=stdIn.nextInt();
		System.out.print("�����lB�F"); int y=stdIn.nextInt();
		int z;
		if (x<y){z=y; y=x; x=z;}
		System.out.println("�~���F"+x+"��"+y+"�ł��B");
	}
}
