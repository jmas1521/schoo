import java.util.Scanner;
public class JAVA7_2 {
static int min(int x,int y,int z) {
	int min=x;
	if (min>y) {
		min=y;
	}
	if(min>z) {
		min=z;
	}
	return min;
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner stdIn=new Scanner(System.in);
		int []a=new int[3];
		for (int y=0;y<3;y++) {
			System.out.print("�l"+(y+1)+":");
			a[y]=stdIn.nextInt();
		}
		System.out.print("�l�P�C�Q�C�R�̍ŏ��l�F"+min(a[0],a[1],a[2]));
	}

}
