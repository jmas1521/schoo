import java.util.Scanner;
public class JAVA8_1 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("健康データを入力してください");
		System.out.print("名前：");
		String x=stdIn.next();
		System.out.print("身長cm：");
		double y=stdIn.nextDouble();
		System.out.print("体重kg：");
		double z=stdIn.nextDouble();
		System.out.print("年齢：");
		int a=stdIn.nextInt();
		System.out.print("性別：");
		String b=stdIn.next();
		System.out.println("下記のデータが入力されました");
		Acount c=new Acount(x,y,z,a,b);
		c.data();
	}
}
