package JAVA10_1;
public class JAVA10_1 {

	public static void main(String[] args) {
		Id a=new Id();
		Id b=new Id();
		Id c=new Id();
		System.out.println("a�̎��ʔԍ�:"+a.getId());
		System.out.println("b�̎��ʔԍ�:"+b.getId());
		System.out.println("c�̎��ʔԍ�:"+c.getId());
		System.out.println("Id.counter="+Id.counter);
		System.out.println("a.counter="+a.counter);
		System.out.println("b.counter="+b.counter);
		System.out.println("�Ō�ɗ^�������ʔԍ�:"+Id.getMaxId());
	}

}
