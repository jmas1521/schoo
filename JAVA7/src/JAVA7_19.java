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
		System.out.print("配列a={");
		for (int y=0;y<a.length;y++) {
			if (y==a.length-1) {
		System.out.print(a[y]+"}");
		}
			else {
				System.out.print(a[y]+",");
			}
		}
		System.out.println("");
		System.out.println("インデックスaからb個の範囲を消去（移動されずにあまる要素は消えない）");
		System.out.print("消したい範囲のインデックスa:");
		int x=stdIn.nextInt();
		System.out.print("消したい個数b:");
		int z=stdIn.nextInt();
		aryRmvN(a,x,z);
		System.out.print("aからb個を消去後の配列a={");
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
