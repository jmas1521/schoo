import java.util.Scanner;
class JAVA6_16{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("4�s3��̍s��a�̗v�f");
		int [][]a=new int[4][3];
		for (int i=0;i<4;i++){
			System.out.println((i+1)+"�s");
			for (int j=0;j<3;j++){
				System.out.print("a["+i+"]["+j+"]=");
				a[i][j]=stdIn.nextInt();
			}
		}
		System.out.println("3�s4��̍s��b�̗v�f");
		int [][]b=new int[3][4];
		for (int i=0;i<3;i++){
			System.out.println((i+1)+"�s");
			for (int j=0;j<4;j++){
				System.out.print("b["+i+"]["+j+"]=");
				b[i][j]=stdIn.nextInt();
			}
		}
		System.out.println("a�̗��b�̍s�̊|�����킹��\��");
		int [][]c=new int[4][4];
		for (int i=0;i<4;i++){
				for(int t=0;t<3;t++){
					c[i][t]=a[i][t]*b[t][i];
					System.out.println("a["+i+"]["+t+"]�~b["+t+"]["+i+"]="+c[i][t]);
				}
		}
	}
}	