
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
	System.out.println("���O�F"+name);
	System.out.println("�g��cm�F"+tall);
	System.out.println("�̏d�Fkg"+weigth);
	System.out.println("�N��F"+old);
	System.out.println("���ʁF"+gender);
}
}
