import java.util.Scanner;
class JAVA4_19{
	public static void main(String[] srgs){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do {
			int y;
			do {
				System.out.print("�G�߂����߂܂��B\n�����ł����F");
				 y=stdIn.nextInt();
			}while (y<=0||13<=y);
			if (y>=3&&y<=5){
			System.out.println("����͏t�ł��B");
			}
			else if (y>=6&&y<=8){
			System.out.println("����͉Ăł��B");
			}
			else if (y>=9&&y<=11){
			System.out.println("����͏H�ł��B");
			}
			else if (y==12||y==1||y==2){
			System.out.println("����͓~�ł��B");
			}
			System.out.print("������x�HYES�@�P/NO�@�O");
			x=stdIn.nextInt();
		}while (x==1);
	}
}