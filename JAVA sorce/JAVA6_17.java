import java.util.Scanner;
class JAVA6_17{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("����̓_������͂��Ă��������B");
		int [][]a=new int[2][6];
		for (int i=0;i<6;i++){
				System.out.print((i+1)+"�Ԃ̓_���F");
				a[0][i]=stdIn.nextInt();
		}
		System.out.println("���w�̓_������͂��Ă��������B");
		for (int i=0;i<6;i++){
				System.out.print((i+1)+"�Ԃ̓_���F");
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
			System.out.println((i+1)+"�Ԃ̍����̍��v�_���F"+b[1][i]+"�A���ρF"+(double)b[1][i]/2);
		}
		System.out.println("����̍��v�_���F"+b[0][0]+"�A���ρF"+(double)b[0][0]/6);
		System.out.println("���w�̍��v�_���F"+b[0][1]+"�A���ρF"+(double)b[0][1]/6);
	}
}