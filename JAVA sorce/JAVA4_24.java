import java.util.Scanner;
class JAVA4_24{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do{
		System.out.print("�����l�F"); x=stdIn.nextInt();
		}while(x<=0);
		int z=1;
		for (int y=2,a=1;y<x;a=x%y,y++){
			if (a==0){
				z++;
			}
			if(z==2){
				System.out.print("�f���ł͂���܂���B");
				break;
			}
		}
			 if(z<=1&&x!=1){
		System.out.println("�f���ł��B");
		}
		else if(x==1){
			System.out.println("�f���ł͂���܂���B");
		}
	}
}