import java.util.Scanner;
import java.util.Random;
class JAVA4_27{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		int x=rand.nextInt(100);
		System.out.println("0~99�̐��l�𓖂ĂĂˁI");
		int a,y;
		count:
		for ( y=10;y>0;y--){
			System.out.println("�������ȁH��"+y+"��");
			 a=stdIn.nextInt();
		    if(a==x){
				System.out.println("�����ł��B");
				break count;
			}
			else if(y==1){
			System.out.println("������"+x+"�ł��B");
				break count;
		    }
			else if (a>x&&y!=1){
			System.out.println("�����Ə�����������I");
			}
			else if (a<x&&y!=1){
			System.out.println("�����Ƒ傫��������I");
			}
		}
		}
	}
