import java.util.Scanner;
public class JAVA7_20 {
static Scanner stdIn=new Scanner(System.in);
static void aryIns(int []a,int idx,int x) {
	for(int y=idx,z=0,b=0;y<a.length;y++) {
		if (y==idx) {
			z=a[idx];
			a[idx]=x;
		}
		else {
			b=a[y];
			a[y]=z;
			z=b;
		}
	}
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
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
		System.out.print("�}���������C���f�b�N�Xa:");
		int x=stdIn.nextInt();
		System.out.print("�}������lb:");
		int z=stdIn.nextInt();
		aryIns(a,x,z);
		System.out.print("�}����̔z��a={");
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
