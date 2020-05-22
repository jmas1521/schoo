import java.util.Scanner;
import java.util.Random;
class JAVA6_15{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		String []a={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
		String []b={"Œ—j“ú","‰Î—j“ú","…—j“ú","–Ø—j“ú","‹à—j“ú","“y—j“ú","“ú—j“ú"};
		System.out.println("–â‘èF‰pŒê‚Å—j“ú‚ğ“–‚Ä‚Ä‚­‚¾‚³‚¢B\ni¬•¶š‚Å‰ğ“š‚µ‚Ä‚­‚¾‚³‚¢j");
		int x,z=-1,c;
		do {
			x=rand.nextInt(7);
			if (x!=z){
		for (String y;;){
			System.out.print(b[x]+":");
			 y=stdIn.next();
			if (y.equals(a[x])){
				break;
			}
			System.out.println("ˆá‚¢‚Ü‚·B");
		}
		System.out.println("³‰ğ‚Å‚·");
			}
			if (x!=z){
				z=x;
				System.out.print("‘±‚¯‚Ü‚·‚©H/YES‚PFNO‚O");
				c=stdIn.nextInt();
			}
			else {
				c=1;
			}
		}while (c==1);
	}
}
			