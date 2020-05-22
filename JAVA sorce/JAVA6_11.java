import java.util.Scanner;
import java.util.Random;
class JAVA6_11{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		int x;
		do{
		System.out.print("óvëfêî(10à»â∫)ÅF");
		 x=stdIn.nextInt();
		}while (x<=0||x>10);
		int []a=new int[x];
		d1:for (int y=0,z=0;y<x;y++){
			z=rand.nextInt(x)+1;
			if (y!=0){
				for (int i=0;i<y;i++){
					if(z==a[i]){
					y--;
					continue d1;
					}
				}
			}
			a[y]=z;
			System.out.println("a["+y+"]="+a[y]);
		}
	}
}
					
			