import java.util.Scanner;
class JAVA3_14{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����lA�F"); int x=stdIn.nextInt();
		System.out.print("�����lB�F"); int y=stdIn.nextInt();
	    int big;
		int small;
		if (x<y){
			big=y; small=x;
			System.out.println("�ő�l�F"+big+"�A�ŏ��l�F"+small);
		}
		else if (x>y){
			big=x; small=y;
			System.out.println("�ő�l�F"+big+"�A�ŏ��l�F"+small);
		}
		else if(x==y){
				System.out.println("�����l�ł�");
		}
	}
}