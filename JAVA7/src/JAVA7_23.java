import java.util.Scanner;
import java.util.Random;
public class JAVA7_23 {
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
	static int H3(int[]a,int x) {
		int z=0;
		for (int y=0;y<a.length;y++) {
			if (a[y]==x) {
				z++;
			}
		}
		return z;
	}
	static int[] arraySrchidx(int []a,int x) {
		int []b=new int[H3(a,x)];
		for (int y=0,c=0;y<a.length;y++) {
			if (a[y]==x) {
				b[c]=y;
				c++;
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
		System.out.print("\n1~10�̒��łǂ̒l���i�[�����C���f�b�N�X�𒊏o���܂����H�F");
		int y=stdIn.nextInt();
		if (H3(a,y)!=0) {
		System.out.println("���\�b�harraySrchidx�ō쐬�����z���\��");
		int[]b=arraySrchidx(a,y);
		System.out.print("�z��arraySrchidx={");
		H2(b);
		}
		else {
			System.out.println("���o����l������܂���B");
		}
	}

}
