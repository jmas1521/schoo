import java.util.Scanner;

class Exercise4_18{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		int m=0;
		
		do{
			System.out.print("nの値：");
			n=stdIn.nextInt();
		}while (n<=0);
		
		for(int i=1;i<=n;i++){
			System.out.println(i+"の2乗は"+i*i);
		}
	}
}
