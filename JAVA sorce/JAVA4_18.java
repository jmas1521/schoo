import java.util.Scanner;
class JAVA4_18{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do {
		System.out.print("x‚Ì’lF"); x=stdIn.nextInt();
		}while (x<=0);
		for(int y=1,z=1;y<=x;y++){
			System.out.println(y+"‚Ì“ñæ‚Í"+(z=y*y)+"‚Å‚·B");
		}
	}
}
		