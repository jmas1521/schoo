import java.util.Scanner;

public class Exercise12_2 {
	public static void main(String[]args) {
		
		Account a = new Account("aさん","1",10000);
		TimeAccount b = new TimeAccount("bさん","2",5000,5000);
		Account c = new Account("cさん","3",5000);
		TimeAccount d = new TimeAccount("dさん","4",5000,0);
		
		int comp = TimeAccount.compBalance(c,d);
		System.out.println(comp);
	}

}
