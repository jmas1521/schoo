import java.util.Scanner;
public class JAVA7_3 {
	static int med(int x,int y,int z) {
		int t=0;
		if (x>y) {
			t=x;
			x=y;
			y=t;
		}
		if(y>z) {
			t=y;
			y=z;
			z=t;
		}
		if(x>y) {
			t=x;
			x=y;
			y=t;
		}
		return y;
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner stdIn=new Scanner(System.in);
		int []a=new int[3];
		for (int y=0;y<3;y++) {
			System.out.print("�l"+(y+1)+":");
			a[y]=stdIn.nextInt();
		}
		System.out.print("�l�P�C�Q�C�R�̒����l�F"+med(a[0],a[1],a[2]));
	}

}
