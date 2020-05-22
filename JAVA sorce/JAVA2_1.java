class JAVA2_1{
 public static void main(String[] args){
  int x;
  int y;
   x=63.5;
   y=18.4;
   System.out.println("xの値は"+x+"です。");
   System.out.println("yの値は"+y+"です。");
   System.out.println("合計は"+(x+y)+"です。");
   System.out.println("平均は"+(x+y)/2+"です。");
 	/*JAVA2_1.java:5: エラー: 不適合な型: 精度が失われる可能性があるdoubleからintへの変換
   x=63.5;
     ^
JAVA2_1.java:6: エラー: 不適合な型: 精度が失われる可能性があるdoubleからintへの変換
   y=18.4;*/
   }
 }