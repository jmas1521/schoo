import java.util.Scanner;
class JAVA4_5{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		do{
			System.out.println("���̐����l�F");
			x=stdIn.nextInt();
		} while (x<=0);
		while(x>=0){
			System.out.print(--x);
		}
		//�iX�ɂT�����jx--��--x�ŕ\�L���鎞�_��-1���o��B�܂��Ax--��5����A--x�͂S����X�^�[�g����B
	}
}
