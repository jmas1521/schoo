import java.util.Scanner;
import java.util.Random;
class JAVA6_14{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		String []a={"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("���F�p��Ō����𓖂ĂĂ��������B\n�i1�����ڂ͑啶���A�ȍ~�͏������ŉ𓚂��Ă��������j");
		int x,z=-1,c;
		do {
			x=rand.nextInt(12);
			if (x!=z){
		for (String y;;){
			System.out.print((x+1)+"���F");
			 y=stdIn.next();
			if (y.equals(a[x])){
				break;
			}
			System.out.println("�Ⴂ�܂��B");
		}
		System.out.println("�����ł�");
			}
			if (x!=z){
				z=x;
				System.out.print("�����܂����H/YES���P�FNO���O");
				c=stdIn.nextInt();
			}
			else {
				c=1;
			}
		}while (c==1);
	}
}
			