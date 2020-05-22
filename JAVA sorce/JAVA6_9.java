import java.util.Scanner;
import java.util.Random;
class JAVA6_9{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("—v‘f”F");
		int x=stdIn.nextInt();
		int []a=new int[x];
		for (int y=0;y<x;y++){
			a[y]=rand.nextInt(10)+1;
			System.out.println("a["+y+"]="+a[y]);
		}
	}
}