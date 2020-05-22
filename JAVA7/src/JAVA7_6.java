import java.util.Scanner;
public class JAVA7_6 {
static void printSeason(int m) {
	switch (m){
	case 3:
	case 4:
		case 5:System.out.println("春です。"); break;
	case 6:
	case 7:
		case 8:System.out.println("夏です。"); break;
	case 9:
	case 10:
		case 11:System.out.println("秋です。"); break;
	case 12:
	case 1:
	case 2:System.out.println("冬です。"); break;
	default:System.out.println(""); break;
	}
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		System.out.print("季節を表示します。\n月を入力してください：");int x=stdIn.nextInt();
		printSeason(x);
	}

	}

