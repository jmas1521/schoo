import java.util.Random;
class JAVA3_17{
	public static void main(String[] args){
		Random rand=new Random();
		int x=rand.nextInt(3);
		switch (x){
			case 0:System.out.print("グー");break;
			case 1:System.out.print("チョキ");break;
			case 2:System.out.print("パー");break;
		}
	}
}
