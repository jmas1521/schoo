package JAVA12_2;

public class TimeAccount extends Account{
	private long Timebalance;
	TimeAccount(String x,String y,long z,long a){
		super(x,y,z);Timebalance=a;
	}
	long getTimebalance() {
		return Timebalance;
	}
	void Timedeposit(long k) {
		Timebalance+=k;
	}
	void Timewithdrow(long k) {
		Timebalance-=k;
	}
	void cancel() {
		deposit(Timebalance);
		Timebalance=0;
	}
	static int compbalance(Account a,Account b) {
		long x,y;
		if (a instanceof TimeAccount) {
		   x=((TimeAccount)a).getTimebalance()+a.getbalance();
		}else {
		   x=a.getbalance();
		}
		if (b instanceof TimeAccount) {
			 y=((TimeAccount)b).getTimebalance()+b.getbalance();
		}else {
			y=b.getbalance();
		}
		if(x>y) {
			return 1;
		}else if(x<y){
			return -1;
		}else {
			return 0;
		}
		
	}
}
