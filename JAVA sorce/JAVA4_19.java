import java.util.Scanner;
class JAVA4_19{
	public static void main(String[] srgs){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do {
			int y;
			do {
				System.out.print("季節を求めます。\n何月ですか：");
				 y=stdIn.nextInt();
			}while (y<=0||13<=y);
			if (y>=3&&y<=5){
			System.out.println("それは春です。");
			}
			else if (y>=6&&y<=8){
			System.out.println("それは夏です。");
			}
			else if (y>=9&&y<=11){
			System.out.println("それは秋です。");
			}
			else if (y==12||y==1||y==2){
			System.out.println("それは冬です。");
			}
			System.out.print("もう一度？YES　１/NO　０");
			x=stdIn.nextInt();
		}while (x==1);
	}
}