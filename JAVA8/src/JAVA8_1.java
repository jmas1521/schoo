import java.util.Scanner;
public class JAVA8_1 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("���N�f�[�^����͂��Ă�������");
		System.out.print("���O�F");
		String x=stdIn.next();
		System.out.print("�g��cm�F");
		double y=stdIn.nextDouble();
		System.out.print("�̏dkg�F");
		double z=stdIn.nextDouble();
		System.out.print("�N��F");
		int a=stdIn.nextInt();
		System.out.print("���ʁF");
		String b=stdIn.next();
		System.out.println("���L�̃f�[�^�����͂���܂���");
		Acount c=new Acount(x,y,z,a,b);
		c.data();
	}
}
