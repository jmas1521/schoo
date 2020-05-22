import java.util.Scanner;
class JAVA2_5{
public static void main(String[] args){
 Scanner stdIn=new Scanner(System.in);
	double x=stdIn.nextDouble();
	double y=stdIn.nextDouble();
	System.out.println("xの値："+x);
	System.out.println("yの値："+y);
	System.out.println("合計は"+(x+y)+"です。");
	System.out.println("平均は"+(x+y)/2+"です。");
}
}

	