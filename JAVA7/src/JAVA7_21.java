import java.util.Scanner;
import java.util.Random;
public class JAVA7_21 {
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
static void aryExchng(int[]a,int[]b) {
	int x=(a.length<=b.length?a.length:b.length);
	for (int y=0,z=0;y<x;y++) {
		z=a[y];
		a[y]=b[y];
		b[y]=z;
	}
}
	public static void main(String[] args) {
		System.out.print("�z��a�̗v�f���F");
		int x=stdIn.nextInt();
		System.out.print("�z��b�̗v�f���F");
		int y=stdIn.nextInt();
		int []a=new int[x];
		int[]b=new int[y];
		System.out.println("1~10�̒l�������_���Ɋi�[�����z���\��");
		System.out.print("�z��a={");
		H(a);
		H2(a);
		System.out.println("");
		System.out.print("�z��b={");
		H(b);
		H2(b);
		System.out.println("");
		System.out.println("�v�f���̏��������������擪����v�f�����ւ����z���\��");
		aryExchng(a,b);
		System.out.print("�z��a={");
		H2(a);
		System.out.println("");
		System.out.print("�z��b={");
		H2(b);
	}
}
