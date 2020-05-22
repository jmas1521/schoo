import java.util.Scanner;
class JAVA3_11{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数値A:"); int x=stdIn.nextInt();
		System.out.print("整数値B："); int y=stdIn.nextInt();
		int z=x>y?x-y:y-x;
		System.out.print("差は"+z+"です。");
		if (z>0&&z<=10)
		System.out.print("その差は10以下です。");
		else if (z>=11)
		System.out.print("その差は11以上です。");
		else if(z==0)
		System.out.print("その差は0です。");
	}
}
