import java.util.Scanner;
class JAVA4_26{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか？");
		int x=stdIn.nextInt();
		double sum=0;
		double y=0;
			for (int z=0;z<x;z++){
			System.out.print("整数：");
			int a=stdIn.nextInt();
				y++;
			if (a<0){
				System.out.println("負の値は加算しません。");
				y--;
				continue;
			}
			sum+=a;
		}
		double b=sum/y;
		System.out.print("合計は"+sum+"、平均は"+b+"です。");
	}
}
		