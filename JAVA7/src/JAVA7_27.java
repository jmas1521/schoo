import java.util.Scanner;
public class JAVA7_27 {
static void printMatrix(int[][]m) {
	for(int i=0;i<m.length;i++) {
		for(int j=0;j<m[i].length;j++) {
			System.out.print(m[i][j]+" ");
		}
		System.out.println("");
	}
}
static boolean addMatrix(int[][]x,int[][]y,int[][]z) {
	if (x.length==y.length&&x.length==z.length) {
		for (int a=0;a<x.length;a++) {
				if (x[a].length!=y[a].length||x[a].length!=z[a].length) {
					return false;
				}
		}
	}
	else {
		return false;
	}
	for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[i].length;j++) {
			z[i][j]=x[i][j]+y[i][j];
		}
	}
	return true;
	}
		
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int[][]a= {{1,2,3},{4,5,6}};
		int[][]b= {{6,3,4},{5,1,2}};
		System.out.println("行列a");printMatrix(a);
		System.out.println("行列b");printMatrix(b);
		System.out.print("行列a,bの和を格納する行列cの要素：");
		int x=stdIn.nextInt();
		System.out.print("行列a,bの和を格納する行列cの要素数：");
		int y=stdIn.nextInt();
		int [][]c=new int[x][y];
		if(addMatrix(a,b,c)==true) {
			System.out.println("行列c");printMatrix(c);
	}
		else {
			System.out.println("要素または要素数が違うので加算をしませんでした。");
		}
	}

}
