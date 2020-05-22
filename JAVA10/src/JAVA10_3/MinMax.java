package JAVA10_3;

public class MinMax {
	private int x;
	private int y;
	private int z;
	private int []a;
	public MinMax(int x, int y,int z,int []a) {
		this.x=x; this.y=y; this.z=z; this.a=a;
	}
	 int min1() {
			int min=x;
			if (min>y) {
				min=y;
			}
			if(min>z) {
				min=z;
			}
			return min;
		}
	 int min2() {
			return x>y?y:x;
		}
	 int max1() {
			int max=x;
			if (max<y) {
				max=y;
			}
			if(max<z) {
				max=z;
			}
			return max;
		}
		 int max2() {
				return x>y?x:y;
			}
	 int minOf() {
	 int min=0;
		for(int y=0;y<a.length;y++) {
			if (y!=0) {
				if (min>=a[y]) {
					min=a[y];
				}
			}
			else {
				min=a[y];
			}
		}
		return min;
	}
	 int maxOf() {
		 int max=0;
			for(int y=0;y<a.length;y++) {
				if (y!=0) {
					if (max<=a[y]) {
						max=a[y];
					}
				}
				else {
					max=a[y];
				}
			}
			return max;
		}
}
