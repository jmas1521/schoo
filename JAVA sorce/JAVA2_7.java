import java.util.Random;
class JAVA2_7{
	public static void main(String[]args){
		Random rand=new Random();
		int x=rand.nextInt(9)+1;
		int y=rand.nextInt(9)-9;
		int z=rand.nextInt(90)+10;
		System.out.println("�ꌅ�̐��̐�����"+x+"�ł��B");
		System.out.println("�ꌅ�̕��̐�����"+y+"�ł��B");
		System.out.println("�񌅂̐��̐�����"+z+"�ł��B");
	}
}