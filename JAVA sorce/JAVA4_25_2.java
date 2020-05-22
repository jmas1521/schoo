import java.util.Scanner;
class JAVA4_25_2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか？");
		 int x=stdIn.nextInt();
		double sum=0;
		double z=0;
		for (int i=0;i<x;i++){
			System.out.print("整数");
			int y=stdIn.nextInt();
			if (sum+y>1000){
				System.out.println("合計が１０００を超えました。");
				System.out.println("最後の数値は無視します。");
				break;
			}
			sum+=y;
			z++;
		}
		double a=sum/z;
		System.out.println("合計は"+sum+"、平均は"+a+"です。");
	}
}
			