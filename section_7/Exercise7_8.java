import java.util.Scanner;
import java.util.Random;

class Exercise7_8{
	
	static int random(int a,int b){
		Random rand=new Random();
		
		int dif;
		
		if(b>=a){
			dif=b-a;
		}else{
			return a;
		}
		
		int random=rand.nextInt(dif)+a;
		return random;
	}
	
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.println("a以上b以下の乱数を生成します。");
		System.out.print("a：");
		int a=stdIn.nextInt();
		System.out.print("b：");
		int b=stdIn.nextInt();
		
		System.out.println(random(a,b));
	}
}
