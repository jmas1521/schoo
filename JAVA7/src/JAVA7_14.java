import java.util.Scanner;

public class JAVA7_14 {
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
	static int setN (int x,int pos,int n) {
		int a=x;
		for (int y=0;y<n;y++){
			 a=set(a,pos-y);
		}
		return a;
	}
	static int resetN (int x,int pos,int n) {
		int a=x;
		for (int y=0;y<n;y++){
			 a=reset(a,pos-y);
		}
		return a;
	}
	static int inverseN(int x,int pos,int n) {
		int bit=0;
		if(pos!=1&&pos-n!=0) {
		for (int y=0,a=1;y<n;y++) {
			for (int z=0;z<30-(pos-2-y);z++) {
				a*=2;
			}
			bit+=a;
			a=1;
		}
		      return bit=bit^x;
		}
		else {
			if (pos!=0) {
			for (int y=1,a=1;y<n;y++) {
				for (int z=0;z<30-(pos-2-(y-1));z++) {
					a*=2;
				}
				bit+=a;
				a=1;
			}
			bit=bit^x;
			}
			else {
				bit=x;
			}
			if (((x>>>31)&1)==1) {
				return bit=reset(bit,1);
			}
			else {
				return bit=set(bit,1);
			}
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
		int e=32-b;
		System.out.print(b+"�Ԗڂ��牽��ς���l�̌��i"+(32-b)+"�`0��"+b+"�Ԃ��܂ށj:");
		int d=stdIn.nextInt();
		int c;
		if (d!=0) {
		do {
		System.out.print("pos�̒l���ǂ�����H���P�ɂ���E�E�P/�O�ɂ���E�E�O/���]������E�E-1>");
		c=stdIn.nextInt();
	}while (c!=1&&c!=0&&c!=-1);
		if (c==1) {
			System.out.println("pos"+b+"����"+d+"��1�ɂ����l�F"+setN(a,e,d));
			bit(setN(a,e,d));
		}
		else if(c==0){
			System.out.println("pos"+b+"����"+d+"��0�ɂ����l�F"+resetN(a,e,d));
			bit(resetN(a,e,d));
		}
		else {
			System.out.println("pos"+b+"����"+d+"�𔽓]�����l�F"+inverseN(a,e,d));
			bit(inverseN(a,e,d));
		}
	}
		else {
			System.out.println("����a�F����ύX�͂���܂���");
		}
}
}