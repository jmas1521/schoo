import java.util.Scanner;
import java.util.Random;
public class JAVA7_26 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static void H(int []x) {
		for (int y=0;y<x.length;y++) {
			x[y]=rand.nextInt(10)+1;
		}
	}
	static void H2(int []x) {
		for (int y=0;y<x.length;y++) {
			if(y==x.length-1) {
				System.out.print(x[y]+"}");
			}
			else {
				System.out.print(x[y]+",");
			}
		}
	}
	static int[] arrayInsOf(int []a,int idx,int x) {
		int []b=new int[a.length+1];
		for (int y=0,z=0,c=0;y<b.length;y++) {
			if (y==idx) {
				b[y]=x;
			}
			else if(y>idx) {
				b[y]=a[y-1];
			}
			else {
				b[y]=a[y];
			}
		}
		return b;
	}
	public static void main(String[] args) {
		System.out.print("�z��a�̗v�f���F");
		int x=stdIn.nextInt();
		int []a=new int[x];
		System.out.println("1~10�̒l�������_���Ɋi�[�����z���\��");
		System.out.print("�z��a={");
		H(a);
		H2(a);
		System.out.print("\n�z��a�̒��łǂ̃C���f�b�N�X���w�肵�܂����H�F");
		int y=stdIn.nextInt();
		System.out.print("�w�肵���C���f�b�N�X�ɑ}������l�F");
		int z=stdIn.nextInt();
		System.out.println("���\�b�harrayInsOf�ō쐬�����z���\��");
		int[]b=arrayInsOf(a,y,z);
		System.out.print("�z��arrayInsOf={");
		H2(b);
	}

}
