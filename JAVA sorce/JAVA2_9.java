import java.util.Random;
class JAVA2_9{
	public static void main(String[] args){
	Random rand=new Random();
		double x=rand.nextDouble();
		double y=rand.nextDouble()*10;
		double z=rand.nextDouble()*2;	
		System.out.println("0à»è„1ñ¢ñû"+x);
		System.out.println("0à»è„10ñ¢ñû"+y);
		System.out.println("Å|ÇPà»è„ÇPñ¢ñû"+(z-1));
	}
}
	