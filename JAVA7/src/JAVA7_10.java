import java.util.Scanner;
import java.util.Random;
public class JAVA7_10 {
static Scanner stdIn=new Scanner(System.in);
static boolean confirmRetry() {
	int count;
	do {
		System.out.print("もう一度？<yes..1/no..0>");
		count=stdIn.nextInt();
	}while(count!=1&&count!=0);
	return count==1;
}
	public static void main(String[] args) {
		Random rand=new Random();
		System.out.println("暗算力トレーニング!!");
		do {
		int x=rand.nextInt(900)+100;
		int y=rand.nextInt(900)+100;
		int z=rand.nextInt(900)+100;
		int []a={x+y+z,x+y-z,x-y+z,x-y-z};
		int b=rand.nextInt(4);
		while(true) {
			switch(b) {
			case 0:System.out.print(x+"+"+y+"+"+z+"=");break;
			case 1:System.out.print(x+"+"+y+"-"+z+"=");break;
			case 2:System.out.print(x+"-"+y+"+"+z+"=");break;
			case 3:System.out.print(x+"-"+y+"-"+z+"=");break;
			}
			int k=stdIn.nextInt();
			if(k==a[b]) {
				break;
			}
			System.out.println("違います");
			}
		}while (confirmRetry());
	}

}
