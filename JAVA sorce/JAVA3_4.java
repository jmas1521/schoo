import java.util.Scanner;
class JAVA3_4{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		System.out.println("A:"+x+"B:"+y);
		if (x>y)
		System.out.println("Aの方が大きいです。");
		else if(x<y)
		System.out.println("Bの方が大きいです。");
		else 
		System.out.println("AとBは同じです。");
	}
}