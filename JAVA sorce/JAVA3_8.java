import java.util.Scanner;
class JAVA3_8{
	public static void main(String[] args){
	 Scanner stdIn= new Scanner(System.in);
	  int x=stdIn.nextInt();
		System.out.println("�_���F"+x);
		if(x>=80&&x<=100)
		System.out.println("���Ȃ��̐��т͗D�ł��B");
		else if(x>=70&&x<=79)
		System.out.println("���Ȃ��̐��т͗ǂł��B");
		else if(x>=60&&x<=69)
		System.out.println("���Ȃ��̐��т͉ł��B");
		else if(x>=0&&x<=59)
		System.out.println("���Ȃ��̐��т͕s�ł��B");
	}
}