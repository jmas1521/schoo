import java.util.Random;
class JAVA6_12{
	public static void main(String[] args){
		Random rand=new Random();
		int []a=new int[10];
			System.out.print("�v�f���F10��0�`9�̒l�������_���Ɋi�[�����z��\na�o");
		for (int x=0;x<10;x++){
			a[x]=rand.nextInt(10);
			if (x==(10-1)){
			System.out.print(a[x]);
			}
			else {
				System.out.print(a[x]+",");
			}
		}
		System.out.println("�p���V���b�t�����܂��B");
		int []c=new int[10];
		for(int y=0,z=0,e=0;y<10;y++){
			z=rand.nextInt(10);
			if (a[z]==-1){
				y--;
				continue ;
			}
			c[y]=a[z];
			a[z]=-1;
		}
		System.out.print("��L�̔z����V���b�t�������z��\na�o");
		for (int x=0;x<10;x++){
			if (x==(10-1)){
			System.out.print(c[x]);
			}
			else {
				System.out.print(c[x]+",");
			}
		}
		System.out.println("�p");
	}
}