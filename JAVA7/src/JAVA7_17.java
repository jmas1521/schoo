import java.util.Scanner;
import java.util.Random;
public class JAVA7_17 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static int linearSearchR(int []a,int key) {
		int y=0;
		for (int i=0;i<a.length;i++){
		if (a[i]==key){
			y=i;
		}
		}
		return y;
	}
		public static void main(String[] args) {
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
			System.out.print("�T���l");
			int key=stdIn.nextInt();
			if ((linearSearchR(a,key))==0){
				System.out.println("���̒l�͂���܂���B");
			}
			else {
				System.out.println("�����a["+linearSearchR(a,key)+"]�ɂ���܂�");
			}
		}

		}
