import java.util.Scanner;
import java.util.Random;
class JAVA6_7{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		final int x=12;
		int []a=new int[x];
		for (int j=0;j<x;j++){
			a[j]=rand.nextInt(10);
		}
		System.out.print("�z��a�̂��ׂĂ̗v�f��\���o");
		for (int j=0;j<x;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("�p");
		System.out.print("�T���l");int key=stdIn.nextInt();
		int i,y;
		for (i=0,y=-1;i<x;i++){
		if (a[i]==key){
			y=i;
		}
	}
		if (y<0){
			System.out.println("���̒l�͂���܂���B");
		}
		else {
			System.out.println("�����a["+y+"]�ɂ���܂�");
		}
	}
}

	
	