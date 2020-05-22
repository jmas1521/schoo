import java.util.Scanner;
import java.util.Random;
public class JAVA7_15 {
	static Scanner stdIn=new Scanner(System.in);
	static Random rand=new Random();
	static int sumOf(int []a) {
	 int sum=0;
		for(int y=0;y<a.length;y++) {
			sum+=a[y];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("‚O`‚X‚Ü‚Å‚Ì’l‚ðŠi”[‚·‚é”z—ña‚Ì—v‘f”F");
		final int x=stdIn.nextInt();;
		int []a=new int[x];
		for (int j=0;j<x;j++){
			a[j]=rand.nextInt(10);
		}
		System.out.print("”z—ña‚Ì‚·‚×‚Ä‚Ì—v‘f‚ð•\Ž¦o");
		for (int j=0;j<x;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println("}");
		System.out.println("”z—ña‚Ì‡Œv‚Í"+sumOf(a)+"‚Å‚·B");
	}

}
