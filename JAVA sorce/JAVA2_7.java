import java.util.Random;
class JAVA2_7{
	public static void main(String[]args){
		Random rand=new Random();
		int x=rand.nextInt(9)+1;
		int y=rand.nextInt(9)-9;
		int z=rand.nextInt(90)+10;
		System.out.println("一桁の正の整数は"+x+"です。");
		System.out.println("一桁の負の整数は"+y+"です。");
		System.out.println("二桁の正の整数は"+z+"です。");
	}
}