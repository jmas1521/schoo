import java.util.Scanner;
import java.util.Random;
class JAVA6_4{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("óvëfêî");
		int x=stdIn.nextInt();
		int []a=new int[x];
		for(int y=0;y<x;y++){
			a[y]=1+rand.nextInt(10);
		}
			for (int y=0;y<10;y++){
			for (int z=0;z<x;z++){
				if ((10-y)<=a[z]){
					System.out.print('*');
				}
				else{
					System.out.print(" ");
				}
				if (z<(x-1)){
					System.out.print(" ");
				}
				else{
					System.out.println("");
				}
			}
			}
		for(int z=0;z<x;z++){
			System.out.print("__");
		}
		System.out.println("");
		for (int z=0;z<x;z++){
			System.out.print(z%10+" ");
		}
	}
}
