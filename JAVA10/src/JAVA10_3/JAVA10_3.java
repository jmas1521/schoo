package JAVA10_3;
import java.util.Scanner;
import java.util.Random;
public class JAVA10_3 {
	public static void main(String[] args) {
		 Scanner stdIn=new Scanner(System.in);
		 Random rand=new Random();
		 System.out.print("����a�F");
		 int b=stdIn.nextInt();
		 System.out.print("����b�F");
		 int y=stdIn.nextInt();
		 System.out.print("����c�F");
		 int z=stdIn.nextInt();
		System.out.print("�O�`�X�܂ł̒l���i�[����z��a�̗v�f���F");
		final int x=stdIn.nextInt();
		int []a=new int[x];
		for (int j=0;j<x;j++){
			a[j]=rand.nextInt(10);
		}
		System.out.print("�z��a�̂��ׂĂ̗v�f��\���o");
		for (int j=0;j<x;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("}");
		MinMax xxx=new MinMax(b,y,z,a);
		System.out.println("�z��a�̍ŏ��l��"+xxx.minOf()+"�ł��B");
		System.out.println("�z��a�̍ő�l��"+xxx.maxOf()+"�ł��B");
		System.out.println("����a�Ɛ���b�̍ŏ��l��"+xxx.min2()+"�ł��B");
		System.out.println("����a�Ɛ���b�̍ő�l"+xxx.max2()+"�ł��B");
		System.out.println("����a�Ɛ���b�Ɛ���c�̍ŏ��l��"+xxx.min1()+"�ł��B");
		System.out.println("����a�Ɛ���b�Ɛ���c�̍ő�l��"+xxx.max1()+"�ł��B");
}
}