import java.util.Scanner;
class JAVA6_6{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int x;
		do{
		System.out.print("何人の点数を入力しますか？"); x=stdIn.nextInt();
		}while (x<=0);
		int a[]=new int[x];
		for (int y=0;y<a.length;y++){
			System.out.print((y+1)+"番の点数：");a[y]=stdIn.nextInt();
		}
		int sum=0,max=0,low=a[0];
		for (int y=0;y<a.length;y++){
			sum+=a[y];
		}
		for (int y=0;y<a.length;y++){
			if (a[y]>max){
				max=a[y];
			}
			else if(a[y]<low){
				low=a[y];
			}
		}
		System.out.println("合計は"+sum+"、平均は"+(double)sum/x+"、最高点は"+max+"、最低点は"+low+"です。");
	}
}