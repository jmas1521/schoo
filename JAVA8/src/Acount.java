
public class Acount {
private String name;
private double tall;
private double weigth;
private int old;
private String gender;
Acount(String name,double tall, double weigth,int old,String gender){
	this.name=name;
	this.tall=tall;
	this.weigth=weigth;
	this.old=old;
	this.gender=gender;
}
void data() {
	System.out.println("名前："+name);
	System.out.println("身長cm："+tall);
	System.out.println("体重：kg"+weigth);
	System.out.println("年齢："+old);
	System.out.println("性別："+gender);
}
}
