import java.util.Scanner;
class JAVA4_25_1{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("���������Z���܂�");
		int x;
		do {
		System.out.print("�����Z���܂����H");
		 x=stdIn.nextInt();
		} while (x<=0);
	double sum=0;
		double y=0;
		for (int i=0;i<x;i++){
			System.out.print("�����i�O�ŏI���j�F");
			int t=stdIn.nextInt();
			if (t==0){
				break;
			}
			sum+=t;
			y++;
		}
		double z=sum/y;
		if (sum>0){
		System.out.println("���v��"+sum+"���ς�"+z+"�ł��B");
		}
		else if(sum==0){
			System.out.print("���ς��v�Z�ł��܂���");
		}
	}
}