import java.util.Scanner;
class JAVA4_15{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		double y,z;
		do {
		System.out.print("���Z���`����");  x=stdIn.nextInt();
		System.out.print("���Z���`�܂�");  y=stdIn.nextInt();
		System.out.print("���Z���`����");  z=stdIn.nextInt();
		}while (x<=0||y<=0||z<=0);
		System.out.println("�g���@�@�W���̏d");
		for (double a=x,b=(x-100)*9/10;y>=a;a+=z,b=(a-100)*9/10)
		System.out.println(a+"   "+b); 
	}
}