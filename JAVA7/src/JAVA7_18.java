import java.util.Scanner;
public class JAVA7_18 {
static Scanner stdIn=new Scanner(System.in);
static void aryRmv(int []a,int idx) {
	for (int y=idx;y<a.length;y++) {
		if (y==a.length-1) {
			a[y]=a[y];
		}
		else {
		a[y]=a[y+1];
	}
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
		System.out.print("���������l�̃C���f�b�N�X�i�C���f�b�N�X�̍ő�l"+(a.length-1)+"�͕s�j�F");
		int x=stdIn.nextInt();
		aryRmv(a,x);
		System.out.print("������̔z��a={");
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

