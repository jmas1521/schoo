import java.util.Scanner;
public class JAVA7_11 {
static void bit(int y) {
	for (int x=31;x>=0;x--) {
		System.out.print(((y>>>x)&1)==1?'1':'0');
	}
	System.out.println("");
}
static int bit2(int x) {
	int z=1;
	for (int y=0;y<x;y++) {
		z*=2;
	}
	return z;
}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("����a�F");
		int a=stdIn.nextInt();
		System.out.print("����a:"+a+"�̃r�b�g��");
		bit(a);
		System.out.print("�w��b�F");
		int b=stdIn.nextInt();
		int c=a*bit2(b);
		int d=a/bit2(b);
		System.out.print("����a�̂Q��"+b+"��{�F"+c+"�̃r�b�g��");
		bit(c);
		System.out.print("����a�̂Q��"+b+"�敪�̂P(�����_�ȉ��؂�̂�)�F"+d+"�̃r�b�g��");
		bit(d);
	}

}
