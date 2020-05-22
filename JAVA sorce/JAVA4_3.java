import java.util.Scanner;
class JAVA4_3{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("整数値A："); int x=stdIn.nextInt();
		System.out.println("整数値B："); int y=stdIn.nextInt();
		int z;
		if (x<y){
			z=x; x=y; y=z;
		}
		do{
			System.out.print(","+x);
			x=x-1;
		}while (x-y>=0);
	}
}
			
		