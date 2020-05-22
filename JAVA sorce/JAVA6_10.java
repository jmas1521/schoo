import java.util.Scanner;
import java.util.Random;
class JAVA6_10{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("—v‘f”F");
		int x=stdIn.nextInt();
		int []a=new int[x];
		for (int y=0,z=0;y<x;y++){
			z=rand.nextInt(10)+1;
			if (y!=0){
			for (;z==a[y-1];){
			z=rand.nextInt(10)+1;
			}
			}
			a[y]=z;
			System.out.println("a["+y+"]="+a[y]);
		}
	}
}
			