import java.util.Scanner;
import java.util.Random;
class JAVA2_8{
	public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	Random rand=new Random();
	int x=stdIn.nextInt();
	System.out.println("�����l�F"+x);
	int y=rand.nextInt(11)-5;
	System.out.println("���̒l�}�T�̂������𐶐����܂����B");
	System.out.println("�����"+(x+y)+"�ł��B");
	}
}
	