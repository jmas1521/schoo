import java.util.Scanner;
class JAVA3_11{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�����lA:"); int x=stdIn.nextInt();
		System.out.print("�����lB�F"); int y=stdIn.nextInt();
		int z=x>y?x-y:y-x;
		System.out.print("����"+z+"�ł��B");
		if (z>0&&z<=10)
		System.out.print("���̍���10�ȉ��ł��B");
		else if (z>=11)
		System.out.print("���̍���11�ȏ�ł��B");
		else if(z==0)
		System.out.print("���̍���0�ł��B");
	}
}
