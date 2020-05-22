import java.util.Scanner;
class JAVA4_9{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do {
			System.out.print("®”’lF"); x=stdIn.nextInt();
		} while (x<=0);
		int y=1;
		int z=1;
		while (y<=x){
			z*=y;
			y+=1;
		}
		System.out.println("1‚©‚ç"+x+"‚Ü‚Å‚ÌÏ‚Í"+z+"‚Å‚·B");
	}
}