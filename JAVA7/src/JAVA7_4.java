import java.util.Scanner;
public class JAVA7_4 {
static int sumUp(int n) {
	int sumUp=0;
	while(n-->0) {
		sumUp+=n;
	}
	return sumUp;
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�l�F");
		int x=stdIn.nextInt();
System.out.print("1����"+x+"�܂ł̘a�F"+sumUp(x));
	}

}
