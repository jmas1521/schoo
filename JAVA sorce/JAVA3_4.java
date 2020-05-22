import java.util.Scanner;
class JAVA3_4{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		System.out.println("A:"+x+"B:"+y);
		if (x>y)
		System.out.println("A‚Ì•û‚ª‘å‚«‚¢‚Å‚·B");
		else if(x<y)
		System.out.println("B‚Ì•û‚ª‘å‚«‚¢‚Å‚·B");
		else 
		System.out.println("A‚ÆB‚Í“¯‚¶‚Å‚·B");
	}
}