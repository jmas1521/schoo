import java.util.Random;
import java.util.Scanner;
public class JAVA7_28 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static void H(int [][]x) {
		for (int y=0;y<x.length;y++) {
			for (int z=0;z<x[y].length;z++) {
			x[y][z]=rand.nextInt(10)+1;
		}
		}
	}
	static void H2(int [][]x) {
		for (int y=0;y<x.length;y++) {
			for (int z=0;z<x[y].length;z++) {
				System.out.println("["+y+"]["+z+"]="+x[y][z]);
			}
	}
	}
	static void addMatrix(int[][]x,int[][]y) {
		int [][]z=new int[x.length][];
		for(int a=0;a<x.length;a++) {
			z[a]=new int[x[a].length];
		}
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				z[i][j]=x[i][j]+y[i][j];
			}
	}
		H2(z);
	}
	public static void main(String[] args) {
		System.out.print("�񎟌��z��a,b�̗v�f�F");
		int x=stdIn.nextInt();
		System.out.print("�񎟌��z��a,b�̗v�f���F");
		int y=stdIn.nextInt();
		int [][]a=new int[x][y];H(a);
		int [][]b=new int[x][y];H(b);
		System.out.println("1~10�̒l�������_���Ɋi�[�����z���\��");
		System.out.println("�񎟌��z��a");
		H2(a);
		System.out.println("�񎟌��z��b");
		H2(b);
		System.out.println("a,b�̊e�v�f�̒l�̘a���i�[�����z��c");
		addMatrix(a,b);
	}

}
