import java.util.Random;
public class JAVA7_8 {
static int random() {
	Random rand=new Random();
	int a=rand.nextInt(100);
	int b=rand.nextInt(100);
	int c;
	System.out.println("����a:"+a);
	System.out.println("����b:"+b);
	if (a<=b) {
	c=rand.nextInt(b-a+1)+a;
	return c;
	}
	else {
		return a;
	}
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("����a,b�𐶐���a�ȏ�b�ȉ��̗����𐶐����郁�\�b�h�̕ԋp�l��\��\na��b���傫���Ƃ���a��Ԃ�");
System.out.println("���\�b�hrandom�̕ԋp�l�F"+random());
}
}