import java.util.Scanner;
class JAVA2_10{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String x=stdIn.nextLine();
		String y=stdIn.nextLine();
		System.out.println("姓:"+x);
		System.out.println("名:"+y);
		System.out.println("こんにちは"+(x+y)+"さん。");
	}
}