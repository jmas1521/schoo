import java.util.Scanner;
public class JAVA7_1 {
static int signOf(int n) {
	if(n>0) {
		return n=1;
	}
	else if(n<0){
		return n=-1;
	}
	else {
		return n=0;
	}
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�l�F");
		int x=stdIn.nextInt();
		System.out.print("���\�b�hsignOf�ŕ]�������l�F"+signOf(x));

	}

}
