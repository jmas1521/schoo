import java.util.Scanner;
class JAVA3_15{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値A："); int x=stdIn.nextInt();
		System.out.print("整数値B："); int y=stdIn.nextInt();
		int z;
		if (x<y){z=y; y=x; x=z;}
		System.out.println("降順："+x+"→"+y+"です。");
	}
}
