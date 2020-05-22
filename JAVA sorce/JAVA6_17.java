import java.util.Scanner;
class JAVA6_17{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("国語の点数を入力してください。");
		int [][]a=new int[2][6];
		for (int i=0;i<6;i++){
				System.out.print((i+1)+"番の点数：");
				a[0][i]=stdIn.nextInt();
		}
		System.out.println("数学の点数を入力してください。");
		for (int i=0;i<6;i++){
				System.out.print((i+1)+"番の点数：");
				a[1][i]=stdIn.nextInt();
		}
		System.out.println("");
		int [][]b=new int[2][6];
		for (int i=0;i<2;i++){
			for (int j=0;j<6;j++){
				if (i==0){
					b[0][0]+=a[i][j];
				}
				else {
					b[0][1]+=a[i][j];
				}
			}
		}
		for (int i=0;i<6;i++){
			for (int j=0;j<2;j++){
					b[1][i]+=a[j][i];
			}
		}
		for (int i=0;i<6;i++){
			System.out.println((i+1)+"番の国数の合計点数："+b[1][i]+"、平均："+(double)b[1][i]/2);
		}
		System.out.println("国語の合計点数："+b[0][0]+"、平均："+(double)b[0][0]/6);
		System.out.println("数学の合計点数："+b[0][1]+"、平均："+(double)b[0][1]/6);
	}
}