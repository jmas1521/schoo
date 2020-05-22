class JAVA6_3{
	public static void main(String[] args){
		double []x=new double[5];
		int y=0;
		for (double z=1.1;y<x.length;y++,z+=1.1){
			x[y]=z;
		System.out.printf("x["+y+"]=%2.1f\n",x[y]);
		}
	}
}