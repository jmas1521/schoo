import java.util.Scanner;
class JAVA4_24{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do{
		System.out.print("整数値："); x=stdIn.nextInt();
		}while(x<=0);
		int z=1;
		for (int y=2,a=1;y<x;a=x%y,y++){
			if (a==0){
				z++;
			}
			if(z==2){
				System.out.print("素数ではありません。");
				break;
			}
		}
			 if(z<=1&&x!=1){
		System.out.println("素数です。");
		}
		else if(x==1){
			System.out.println("素数ではありません。");
		}
	}
}