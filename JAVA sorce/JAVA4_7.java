import java.util.Scanner;
class JAVA4_7{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do{
		System.out.print("‰½ŒÂ–+‚ğ•\¦‚µ‚Ü‚·‚©B");
		 x=stdIn.nextInt();
		}while (x<1);
		int y=0;
		if (x%2==0){
			while (y<x/2){
				System.out.print('*');System.out.print('+');
				y++;
			}
		}
			else {
				while (y<(x-1)/2){
					System.out.print('*');System.out.print('+');
				y++;
				}
				System.out.print('*');
			}
	}
}
				
		
	