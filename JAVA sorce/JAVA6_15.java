import java.util.Scanner;
import java.util.Random;
class JAVA6_15{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		String []a={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		String []b={"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
		System.out.println("問題：英語で曜日を当ててください。\n（小文字で解答してください）");
		int x,z=-1,c;
		do {
			x=rand.nextInt(7);
			if (x!=z){
		for (String y;;){
			System.out.print(b[x]+":");
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
			