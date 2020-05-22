import java.util.Scanner;
class JAVA6_5{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("óvëfêî:");final int x=stdIn.nextInt();
		int []a=new int[x];
		for (int y=0;y<x;y++){
			System.out.print("a["+y+"]=");a[y]=stdIn.nextInt();
		}
			System.out.print("a={");
				for (int y=0;y<x;y++){
					if (y<(x-1)){
						System.out.print(a[y]+",");
					}
					else{
						System.out.print(a[y]);
					}
				}
				System.out.print("}");
	}
}
