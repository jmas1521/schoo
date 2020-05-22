import java.util.Scanner;
class JAVA3_8{
	public static void main(String[] args){
	 Scanner stdIn= new Scanner(System.in);
	  int x=stdIn.nextInt();
		System.out.println("点数："+x);
		if(x>=80&&x<=100)
		System.out.println("あなたの成績は優です。");
		else if(x>=70&&x<=79)
		System.out.println("あなたの成績は良です。");
		else if(x>=60&&x<=69)
		System.out.println("あなたの成績は可です。");
		else if(x>=0&&x<=59)
		System.out.println("あなたの成績は不可です。");
	}
}