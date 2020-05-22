import java.util.Scanner;
public class JAVA7_13 {
	static void bit(int y) {
		for (int x=31;x>=0;x--) {
			System.out.print(((y>>x)&1)==1?'1':'0');
		}
		System.out.println("");
	}
	static int set (int x,int pos) {
		int a=0,b=0;
		a=x>>>32-pos;
		b=a|1;
		b=b<<32-pos;
		a=x|b;
		return a;
	}
	static int reset (int x,int pos) {
		int a=0,b=0;
		a=~x;
		a=set(a,pos);
		b=~a;
		a=x&b;
		return a;
	}
	static int inverse(int x,int pos) {
		if (((x>>>32-pos)&1)==1) {
			return reset(x,pos);
		}
		else {
			return set(x,pos);
		}
	}
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Scanner stdIn=new Scanner(System.in);
		System.out.print("����a�F");
		int a=stdIn.nextInt();
		System.out.print("����a:"+a+"�̃r�b�g��");
		bit(a);
		System.out.print("pos���Ԗ�(�E�[0�Ԗځ`31�Ԗ�):");
		int b=stdIn.nextInt();
		int d=32-b;
		int c;
		do {
		System.out.print("pos�̒l���ǂ�����H���P�ɂ���E�E�P/�O�ɂ���E�E�O/���]������E�E-1>");
		c=stdIn.nextInt();
	}while (c!=1&&c!=0&&c!=-1);
		if (c==1) {
			System.out.println("pos�̒l��1�ɂ����l�F"+set(a,d));
			bit(set(a,d));
		}
		else if(c==0){
			System.out.println("pos�̒l��0�ɂ����l�F"+reset(a,d));
			bit(reset(a,d));
		}
		else {
			System.out.println("pos�̒l�𔽓]�����l�F"+inverse(a,d));
			bit(inverse(a,d));
		}
	}

}
