package JAVA10_2;
import java.util.Scanner;
public class JAVA10_2 {

	public static void main(String[] args) {
		ExId a=new ExId();
		ExId b=new ExId();
		ExId c=new ExId();
		ExId d=new ExId();
		ExId e=new ExId();
		System.out.println("a�̎��ʔԍ�:"+a.getId());
		System.out.println("b�̎��ʔԍ�:"+b.getId());
		System.out.println("c�̎��ʔԍ�:"+c.getId());
		System.out.println("d�̎��ʔԍ�:"+d.getId());
		System.out.println("e�̎��ʔԍ�:"+e.getId());
		System.out.print("�ύX����ԍ��i����ȍ~��ύX�j�F");
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.print("�������̑����H�F");
		int y=stdIn.nextInt();
		System.out.println("�ύX��");
		System.out.println("a�̎��ʔԍ�:"+a.getId(x,y));
		System.out.println("b�̎��ʔԍ�:"+b.getId(x,y));
		System.out.println("c�̎��ʔԍ�:"+c.getId(x,y));
		System.out.println("d�̎��ʔԍ�:"+d.getId(x,y));
		System.out.println("e�̎��ʔԍ�:"+e.getId(x,y));
		System.out.println("�Ō�ɗ^�������ʔԍ�:"+ExId.getMaxId());
}
}
