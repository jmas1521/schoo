import java.util.Random;
public class JAVA7_8 {
static int random() {
	Random rand=new Random();
	int a=rand.nextInt(100);
	int b=rand.nextInt(100);
	int c;
	System.out.println("乱数a:"+a);
	System.out.println("乱数b:"+b);
	if (a<=b) {
	c=rand.nextInt(b-a+1)+a;
	return c;
	}
	else {
		return a;
	}
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("乱数a,bを生成しa以上b以下の乱数を生成するメソッドの返却値を表示\naがbより大きいときはaを返す");
System.out.println("メソッドrandomの返却値："+random());
}
}