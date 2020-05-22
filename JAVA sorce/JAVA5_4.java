import java.util.Scanner;
class JAVA5_4{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("整数A,B,Cの合計と平均を表示");
		System.out.print("整数A：");int x=stdIn.nextInt();
		System.out.print("整数B：");int y=stdIn.nextInt();
		System.out.print("整数C：");int z=stdIn.nextInt();
		System.out.println("合計は"+(x+y+z)+"、平均は"+(x+y+z)/3.0+"です。");
	}
}