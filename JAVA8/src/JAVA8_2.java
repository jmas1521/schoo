import java.util.Scanner;
public class JAVA8_2 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("車のデータを入力せよ。");
		System.out.print("名前：");String name=stdIn.next();
		System.out.print("車幅：");int width=stdIn.nextInt();
		System.out.print("高さ：");int height=stdIn.nextInt();
		System.out.print("長さ：");int length=stdIn.nextInt();
		System.out.print("ガソリン量：");double fuel=stdIn.nextDouble();
		System.out.print("タンク容量：");double tank=stdIn.nextDouble();
		Car mycar=new Car(name,width,height,length,fuel);
		while (true) {
			System.out.println("現在地（"+mycar.getX()+","+mycar.getY()+")・残り燃料"+mycar.getFuel());
			System.out.print("移動しますか[0・・NO/1・・YES]");
			if (stdIn.nextInt()==0) {break;}
			
			System.out.print("X方向の移動距離：");
			double dx=stdIn.nextDouble();
			System.out.print("Y方向の移動距離：");
			double dy=stdIn.nextDouble();
			
			if (!mycar.move(dx, dy)) {
				System.out.println("燃料が足りません。補給します。");
				System.out.print("いくら補給しますか（0~"+(tank-mycar.getFuel())+"）:");
				double x=stdIn.nextDouble();
				mycar.supply(x);
			}
		}
	}

}
