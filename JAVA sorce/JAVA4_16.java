import java.util.Scanner;
class JAVA4_16{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("‰½ŒÂ–‚ð•\Ž¦‚µ‚Ü‚·‚©B");int x=stdIn.nextInt();
		if (x>=5){
		for (int y=5;y<=x;y+=5)
		System.out.println("*****");
		for (int y=x%5;0<y;y--)
		System.out.print('*');
		}
		else {
			for (int y=0;y<x;y++)
			System.out.print('*');
		}
			
	}
}