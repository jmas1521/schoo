import java.util.Scanner;
class JAVA6_18{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�񎟌��z�񂃂̗v�f���F");
		int x=stdIn.nextInt();
		int [][]c=new int[x][];
		int z;
		for (int y=0;y<x;y++){
			System.out.print("c["+y+"]�̗v�f���F");
			z=stdIn.nextInt();
			c[y]=new int[z];
			for(int i=0;i<c[y].length;i++){
				System.out.printf("c["+y+"]["+i+"]=");
				c[y][i]=stdIn.nextInt();
			}
		}
		System.out.println("�s��c");
		for (int i=0;i<x;i++){
			for (int j=0;j<c[i].length;j++){
				System.out.printf("%3d",c[i][j]);
			}
			System.out.println("");
		}
	}
}
			