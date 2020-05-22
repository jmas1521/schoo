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
		System.out.println("s—ña");printMatrix(a);
		System.out.println("s—ñb");printMatrix(b);
		System.out.print("s—ña,b‚Ì˜a‚ðŠi”[‚·‚és—ñc‚Ì—v‘fF");
		int x=stdIn.nextInt();
		System.out.print("s—ña,b‚Ì˜a‚ðŠi”[‚·‚és—ñc‚Ì—v‘f”F");
		int y=stdIn.nextInt();
		int [][]c=new int[x][y];
		if(addMatrix(a,b,c)==true) {
			System.out.println("s—ñc");printMatrix(c);
	}
		else {
			System.out.println("—v‘f‚Ü‚½‚Í—v‘f”‚ªˆá‚¤‚Ì‚Å‰ÁŽZ‚ð‚µ‚Ü‚¹‚ñ‚Å‚µ‚½B");
		}
	}

}
