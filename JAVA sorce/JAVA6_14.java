import java.util.Scanner;
import java.util.Random;
class JAVA6_14{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		String []a={"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("問題：英語で月名を当ててください。\n（1文字目は大文字、以降は小文字で解答してください）");
		int x,z=-1,c;
		do {
			x=rand.nextInt(12);
			if (x!=z){
		for (String y;;){
			System.out.print((x+1)+"月：");
			 y=stdIn.next();
			if (y.equals(a[x])){
				break;
			}
			System.out.println("違います。");
		}
		System.out.println("正解です");
			}
			if (x!=z){
				z=x;
				System.out.print("続けますか？/YES＝１：NO＝０");
				c=stdIn.nextInt();
			}
			else {
				c=1;
			}
		}while (c==1);
	}
}
			