import java.util.Scanner;
public class JAVA7_6 {
static void printSeason(int m) {
	switch (m){
	case 3:
	case 4:
		case 5:System.out.println("�t�ł��B"); break;
	case 6:
	case 7:
		case 8:System.out.println("�Ăł��B"); break;
	case 9:
	case 10:
		case 11:System.out.println("�H�ł��B"); break;
	case 12:
	case 1:
	case 2:System.out.println("�~�ł��B"); break;
	default:System.out.println(""); break;
	}
}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner stdIn=new Scanner(System.in);
		System.out.print("�G�߂�\�����܂��B\n������͂��Ă��������F");int x=stdIn.nextInt();
		printSeason(x);
	}

	}

