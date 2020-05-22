import java.util.Scanner;
class JAVA4_25_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("整数を加算します");
		int x;
		do {
		System.out.print("何個加算しますか？");
		 x=stdIn.nextInt();
		} while (x<=0);
	double sum=0;
		double y=0;
		for (int i=0;i<x;i++){
			System.out.print("整数（０で終了）：");
			int t=stdIn.nextInt();
			if (t==0){
				break;
			}
			sum+=t;
			y++;
		}
		double z=sum/y;
		if (sum>0){
		System.out.println("合計は"+sum+"平均は"+z+"です。");
		}
		else if(sum==0){
			System.out.print("平均を計算できません");
		}
	}
}