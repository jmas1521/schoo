import java.util.Scanner;
class JAVA3_14{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値A："); int x=stdIn.nextInt();
		System.out.print("整数値B："); int y=stdIn.nextInt();
	    int big;
		int small;
		if (x<y){
			big=y; small=x;
			System.out.println("最大値："+big+"、最小値："+small);
		}
		else if (x>y){
			big=x; small=y;
			System.out.println("最大値："+big+"、最小値："+small);
		}
		else if(x==y){
				System.out.println("同じ値です");
		}
	}
}