import java.util.Scanner;
public class JAVA7_12 {
	static void bit(int y) {
		for (int x=31;x>=0;x--) {
			System.out.print(((y>>x)&1)==1?'1':'0');
		}
		System.out.println("");
	}
	static int rRotate(int x,int n) {
		int a=0;
		a=x>>>n;
		x=x<<32-n;
		a=a|x;
		return a;
	}
	static int lRotate(int x,int n) {
		int a=0;
		a=x<<n;
		x=x>>>32-n;
		a=a|x;
		return a;
	}
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("����a�F");
		int a=stdIn.nextInt();
		System.out.print("����a:"+a+"�̃r�b�g��");
		bit(a);
		System.out.print("����]���܂����H");
		int b=stdIn.nextInt();
		int c;
		do {
		System.out.print("�ǂ���ɉ�]�����܂����H���E�E�E�P/���E�E�O>");
		c=stdIn.nextInt();
	}while (c!=1&&c!=0);
		if (c==1) {
			System.out.println("�E��"+b+"��]�����l�F"+rRotate(a,b));
			bit(rRotate(a,b));
		}
		else {
			System.out.println("����"+b+"��]�����l�F"+lRotate(a,b));
			bit(lRotate(a,b));
		}
	}
}
