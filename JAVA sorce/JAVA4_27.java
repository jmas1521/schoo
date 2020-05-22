import java.util.Scanner;
import java.util.Random;
class JAVA4_27{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		int x=rand.nextInt(100);
		System.out.println("0~99の数値を当ててね！");
		int a,y;
		count:
		for ( y=10;y>0;y--){
			System.out.println("いくつかな？後"+y+"回");
			 a=stdIn.nextInt();
		    if(a==x){
				System.out.println("正解です。");
				break count;
			}
			else if(y==1){
			System.out.println("正解は"+x+"です。");
				break count;
		    }
			else if (a>x&&y!=1){
			System.out.println("もっと小さい数だよ！");
			}
			else if (a<x&&y!=1){
			System.out.println("もっと大きい数だよ！");
			}
		}
		}
	}
