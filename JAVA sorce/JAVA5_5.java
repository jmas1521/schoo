import java.util.Scanner;
class JAVA5_5{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("����A,B,C�̍��v�ƕ��ς�\��");
		System.out.print("����A�F");int x=stdIn.nextInt();
		System.out.print("����B�F");int y=stdIn.nextInt();
		System.out.print("����C�F");int z=stdIn.nextInt();
		double a=(double)(x+y+z)/3;
		System.out.println("���v��"+(x+y+z)+"�A���ς�"+a+"�ł��B");
	}
}