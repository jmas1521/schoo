import java.util.Scanner;
class JAVA6_19{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�N���X���F");
		int x=stdIn.nextInt();
		int [][]c=new int[x][];
		int z;
		for (int y=0;y<x;y++){
			System.out.print((y+1)+"�g�̐l��");
			z=stdIn.nextInt();
			c[y]=new int[z];
			for(int i=0;i<c[y].length;i++){
				System.out.printf((y+1)+"�g��"+(i+1)+"�Ԃ̓_��:");
				c[y][i]=stdIn.nextInt();
			}
		}
		int []d=new int[x];
		for (int y=0;y<x;y++){
			for (int e=0;e<c[y].length;e++){
				d[y]+=c[y][e];
			}
		}
		System.out.printf("%2s%2s%4s%4s","�g","|","���v","����");
		System.out.println("");
			System.out.print("----+-----------------");
		System.out.println("");
		for (int y=0;y<x;y++){
			System.out.printf("%2s%2s%6d%6.1f\n",(y+1)+"�g","|",d[y],(double)d[y]/c[y].length);
		}
			System.out.println("----+-----------------");
		int sum=0;
		for (int y=0;y<x;y++){
			sum+=d[y];
		}
		int f=0;
		for (int y=0;y<x;y++){
			for (int e=0;e<c[y].length;e++){
				f++;
			}
		}
		System.out.printf("%2s%2s%6d%6.1f\n","�v","|",sum,(double)sum/f);
	}
}
