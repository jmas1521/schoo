import java.util.Scanner;
public class JAVA7_19 {
	static Scanner stdIn=new Scanner(System.in);
	static void aryRmvN(int []a,int idx,int n) {
		for (int y=0;y<n;y++) {
			if(idx+n+y==a.length) {
				break ;
			}
			a[idx+y]=a[idx+n+y];
	}
	}
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10};
		System.out.print("�z��a={");
		for (int y=0;y<a.length;y++) {
			if (y==a.length-1) {
		System.out.print(a[y]+"}");
		}
			else {
				System.out.print(a[y]+",");
			}
		}
		System.out.println("");
		System.out.println("�C���f�b�N�Xa����b�͈̔͂������i�ړ����ꂸ�ɂ��܂�v�f�͏����Ȃ��j");
		System.out.print("���������͈͂̃C���f�b�N�Xa:");
		int x=stdIn.nextInt();
		System.out.print("����������b:");
		int z=stdIn.nextInt();
		aryRmvN(a,x,z);
		System.out.print("a����b��������̔z��a={");
		for (int y=0;y<a.length;y++) {
			if (y==a.length-1) {
		System.out.print(a[y]+"}");
		}
			else {
				System.out.print(a[y]+",");
			}
		}
	}

}
