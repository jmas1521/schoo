package JAVA12_2;

public class Account {
private String name;
private String no;
private long balance;
Account (String x,String y,long z){
	name=x; no=y; balance=z; 
}
String getName() {
	return name;
}
String getNo() {
	return name;
}
long getbalance() {
	return balance;
}
void deposit(long k) {
	balance+=k;
}
void withdrow(long k) {
	balance-=k;
}

}
