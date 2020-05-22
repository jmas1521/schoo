package JAVA10_5;

public class Account {
	private static int counnter;
	private String name;
	private String no;
	private long balance;
	private int id;
static {
	counnter=0;
}
{
	id=++counnter;
	System.out.println("–¾ğ‹âs‚ÌŒûÀŠJİ‚ ‚è‚ª‚Æ‚¤‚²‚´‚¢‚Ü‚·B");
	}
public Account(String name,String no,long balance) {
	this.name=name;
	this.no=no;
	this.balance=balance;
}
public String getName() {
	return name;
}
public String getNo() {
	return no;
}
public long getBalance(){
	return balance;
}
public long getId() {
	return id;
}
public void deposit(long k) {
	balance+=k;
}
public void withdraw(long k) {
	balance-=k;
}
}