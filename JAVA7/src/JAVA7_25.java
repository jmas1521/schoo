import java.util.Scanner;
import java.util.Random;
public class JAVA7_25 {
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
	static int[] arrayRmvOfN(int []a,int idx,int n) {
		int []b=new int[a.length-n];
		for (int y=0,z=0;y<b.length;y++) {
		if (y>=idx) {
			b[y]=a[idx+n+z];
			z++;
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
		System.out.print("�w�肵���C���f�b�N�X���牽����������i�w�肵���C���f�b�N�X���܂�0~"+(x-y)+"�j�H�F");
		int z=stdIn.nextInt();
		if(z!=0&&z!=x) {
		System.out.println("���\�b�harrayRmvOfN�ō쐬�����z���\��");
		int[]b=arrayRmvOfN(a,y,z);
		System.out.print("�z��arrayRmvOfN={");
		H2(b);
		}
		else if(z==0){
			System.out.print("�������O�Ȃ̂Ŕz��͕ς��܂���");
		}
		else if(z==x) {
			System.out.println("���ׂď������Ă���̂Ŕz��͂���܂���B");
		}
	}

}
