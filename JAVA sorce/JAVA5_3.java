import java.util.Scanner;
class JAVA5_3{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("����a�Ɛ���b�̒l���ׁAa���傫����true�Ab���傫�����false��\��");
		System.out.print("����a:");int x=stdIn.nextInt();
		System.out.print("����b:");int y=stdIn.nextInt();
		System.out.println("a>b="+(x>y));
	}
}