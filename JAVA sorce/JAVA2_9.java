import java.util.Random;
class JAVA2_9{
	public static void main(String[] args){
	Random rand=new Random();
		double x=rand.nextDouble();
		double y=rand.nextDouble()*10;
		double z=rand.nextDouble()*2;	
		System.out.println("0�ȏ�1����"+x);
		System.out.println("0�ȏ�10����"+y);
		System.out.println("�|�P�ȏ�P����"+(z-1));
	}
}
	