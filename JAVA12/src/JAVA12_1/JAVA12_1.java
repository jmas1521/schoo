package JAVA12_1;

import java.util.Scanner;

public class JAVA12_1 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("�Ԃ̃f�[�^����͂���B");
		System.out.print("���O�F");String name=stdIn.next();
		System.out.print("�ԕ��F");int width=stdIn.nextInt();
		System.out.print("�����F");int height=stdIn.nextInt();
		System.out.print("�����F");int length=stdIn.nextInt();
		System.out.print("�K�\�����ʁF");double fuel=stdIn.nextDouble();
		System.out.print("�F");String coler=stdIn.next();
		System.out.print("�i���o�[�F");String myno=stdIn.next();
		Car2 mycar2=new Car2(name,width,height,length,coler,myno,fuel);
		while (true) {
			System.out.println("���ݒn�i"+mycar2.getX()+","+mycar2.getY()+")�E�c��R��"+mycar2.getFuel());
			System.out.print("�ړ����܂���[0�E�ENO/1�E�EYES]");
			if (stdIn.nextInt()==0) {break;}
			
			System.out.print("X�����̈ړ������F");
			double dx=stdIn.nextDouble();
			System.out.print("Y�����̈ړ������F");
			double dy=stdIn.nextDouble();
			mycar2.move(dx, dy);
				
			}
	System.out.println("�����s�����F"+mycar2.move2());
}
}