import java.util.Scanner;
public class JAVA7_9 {
static int readPlusInt() {
	Scanner stdIn=new Scanner(System.in);
	int x;
	do {
		System.out.print("���̐����l�F");
		x=stdIn.nextInt();
	}while (x<=0);
	return x;
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		readPlusInt();

	}

}
