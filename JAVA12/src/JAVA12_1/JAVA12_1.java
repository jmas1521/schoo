package JAVA12_1;

import java.util.Scanner;

public class JAVA12_1 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("車のデータを入力せよ。");
		System.out.print("名前：");String name=stdIn.next();
		System.out.print("車幅：");int width=stdIn.nextInt();
		System.out.print("高さ：");int height=stdIn.nextInt();
		System.out.print("長さ：");int length=stdIn.nextInt();
		System.out.print("ガソリン量：");double fuel=stdIn.nextDouble();
		System.out.print("色");String coler=stdIn.next();
		System.out.print("ナンバー：");String myno=stdIn.next();
		Car2 mycar2=new Car2(name,width,height,length,coler,myno,fuel);
		while (true) {
			System.out.println("現在地（"+mycar2.getX()+","+mycar2.getY()+")・残り燃料"+mycar2.getFuel());
			System.out.print("移動しますか[0・・NO/1・・YES]");
			if (stdIn.nextInt()==0) {break;}
			
			System.out.print("X方向の移動距離：");
			double dx=stdIn.nextDouble();
			System.out.print("Y方向の移動距離：");
			double dy=stdIn.nextDouble();
			mycar2.move(dx, dy);
				
			}
	System.out.println("総走行距離："+mycar2.move2());
}
}