import java.util.Scanner;
class JAVA6_8{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("要素数：");
		final int x=stdIn.nextInt();
		double []a=new double[x];
		for (int y=0;y<x;y++){
			System.out.print("a["+y+"]=");
			a[y]=stdIn.nextInt();
		}
		double sum=0;
		for (double z:a){
			sum+=z;
		}
		System.out.println("合計は"+sum+"、平均は"+sum/x+"です");
	}
}