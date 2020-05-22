import java.util.Scanner;
class JAVA5_3{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("整数aと整数bの値を比べ、aが大きけれtrue、bが大きければfalseを表示");
		System.out.print("整数a:");int x=stdIn.nextInt();
		System.out.print("整数b:");int y=stdIn.nextInt();
		System.out.println("a>b="+(x>y));
	}
}