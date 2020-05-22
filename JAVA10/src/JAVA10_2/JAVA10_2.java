package JAVA10_2;
import java.util.Scanner;
public class JAVA10_2 {

	public static void main(String[] args) {
		ExId a=new ExId();
		ExId b=new ExId();
		ExId c=new ExId();
		ExId d=new ExId();
		ExId e=new ExId();
		System.out.println("aの識別番号:"+a.getId());
		System.out.println("bの識別番号:"+b.getId());
		System.out.println("cの識別番号:"+c.getId());
		System.out.println("dの識別番号:"+d.getId());
		System.out.println("eの識別番号:"+e.getId());
		System.out.print("変更する番号（それ以降を変更）：");
		Scanner stdIn=new Scanner(System.in);
		int x=stdIn.nextInt();
		System.out.print("いくつずつの増加？：");
		int y=stdIn.nextInt();
		System.out.println("変更後");
		System.out.println("aの識別番号:"+a.getId(x,y));
		System.out.println("bの識別番号:"+b.getId(x,y));
		System.out.println("cの識別番号:"+c.getId(x,y));
		System.out.println("dの識別番号:"+d.getId(x,y));
		System.out.println("eの識別番号:"+e.getId(x,y));
		System.out.println("最後に与えた識別番号:"+ExId.getMaxId());
}
}
