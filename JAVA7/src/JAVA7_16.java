import java.util.Scanner;
import java.util.Random;
public class JAVA7_16 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static int minOf(int []a) {
	 int min=0;
		for(int y=0;y<a.length;y++) {
			if (y!=0) {
				if (min>=a[y]) {
					min=a[y];
				}
			}
			else {
				min=a[y];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.print("�O�`�X�܂ł̒l���i�[����z��a�̗v�f���F");
		final int x=stdIn.nextInt();;
		int []a=new int[x];
		for (int j=0;j<x;j++){
			a[j]=rand.nextInt(10);
		}
		System.out.print("�z��a�̂��ׂĂ̗v�f��\���o");
		for (int j=0;j<x;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("}");
		System.out.println("�z��a�̍ŏ��l��"+minOf(a)+"�ł��B");
	}

}
