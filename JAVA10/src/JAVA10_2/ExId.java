package JAVA10_2;

public class ExId {
	private static int counter=0;
    private int id;
    public ExId(){
		id=++counter;
	}
	public int getId() {
		return id;
	}
	public int getId(int x,int y) {
		int z=0;
		if(y==1) {
			return getId();
		}
		else {
			if(x<id) {
				id=(x+1)+y*(id-x);
				return id;
			}
			else {
				return getId();
			}
		}
	}
	public static int getMaxId() {
		return counter;
	}
}

