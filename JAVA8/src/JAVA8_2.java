import java.util.Scanner;
public class JAVA8_2 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("�Ԃ̃f�[�^����͂���B");
		System.out.print("���O�F");String name=stdIn.next();
		System.out.print("�ԕ��F");int width=stdIn.nextInt();
		System.out.print("�����F");int height=stdIn.nextInt();
		System.out.print("�����F");int length=stdIn.nextInt();
		System.out.print("�K�\�����ʁF");double fuel=stdIn.nextDouble();
		System.out.print("�^���N�e�ʁF");double tank=stdIn.nextDouble();
		Car mycar=new Car(name,width,height,length,fuel);
		while (true) {
			System.out.println("���ݒn�i"+mycar.getX()+","+mycar.getY()+")�E�c��R��"+mycar.getFuel());
			System.out.print("�ړ����܂���[0�E�ENO/1�E�EYES]");
			if (stdIn.nextInt()==0) {break;}
			
			System.out.print("X�����̈ړ������F");
			double dx=stdIn.nextDouble();
			System.out.print("Y�����̈ړ������F");
			double dy=stdIn.nextDouble();
			
			if (!mycar.move(dx, dy)) {
				System.out.println("�R��������܂���B�⋋���܂��B");
				System.out.print("������⋋���܂����i0~"+(tank-mycar.getFuel())+"�j:");
				double x=stdIn.nextDouble();
				mycar.supply(x);
			}
		}
	}

}
