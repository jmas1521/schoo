import java.util.Scanner;
class JAVA6_16{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("4行3列の行数aの要素");
		int [][]a=new int[4][3];
		for (int i=0;i<4;i++){
			System.out.println((i+1)+"行");
			for (int j=0;j<3;j++){
				System.out.print("a["+i+"]["+j+"]=");
				a[i][j]=stdIn.nextInt();
			}
		}
		System.out.println("3行4列の行数bの要素");
		int [][]b=new int[3][4];
		for (int i=0;i<3;i++){
			System.out.println((i+1)+"行");
			for (int j=0;j<4;j++){
				System.out.print("b["+i+"]["+j+"]=");
				b[i][j]=stdIn.nextInt();
			}
		}
		System.out.println("aの列とbの行の掛け合わせを表示");
		int [][]c=new int[4][4];
		for (int i=0;i<4;i++){
				for(int t=0;t<3;t++){
					c[i][t]=a[i][t]*b[t][i];
					System.out.println("a["+i+"]["+t+"]×b["+t+"]["+i+"]="+c[i][t]);
				}
		}
	}
}	