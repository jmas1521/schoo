import java.util.Scanner;
import java.util.Random;

class Exercise6_15{
	public static void main(String[]args){
		
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		int flag1=0;
		int flag2=0;
		int number=0;
		
		String []DayE ={"Monday","Tuesday","Wednesday","Thirsday","Friday","Satuaday","Sunday"};
		String []DayJ ={"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
		
		System.out.println("英語の曜日名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。");
		
	retry:
		while(true){
			if(flag2 != 1){
				number=rand.nextInt(7);
				if(flag1==number){
					continue retry;
				}
			}
			
			System.out.print(DayJ[number]+"：");
			String m=stdIn.next();
			
			if(!(m.equals(DayE[number]))){
				System.out.println("違います。");
				flag2 = 1;
			}else{
				System.out.println("正解です。もう一度？　1…Yes/0…No");
				int question=stdIn.nextInt();
				flag1 = number;
				flag2 = 0;
				System.out.println();
				
				if (!(question==1)){
					break;
				}
			}
		}
	}
}