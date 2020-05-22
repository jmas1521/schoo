import java.util.Scanner;
class JAVA6_13{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("要素数：");
		int x=stdIn.nextInt();
		int []a=new int[x];
		int []b=new int[x];
		for (int y=0;y<x;y++){
			System.out.print("a["+y+"]=");
			a[y]=stdIn.nextInt();
		}
		System.out.println("配列aを配列bに逆順コピーします。");
		for (int y=0,z=(x-1);y<x;y++,z--){
			b[y]=a[z];
			System.out.println("b["+y+"]="+b[y]);
		}
	}
}