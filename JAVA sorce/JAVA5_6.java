class JAVA5_6{
	public static void main(String[] args){
		System.out.println("   float       int   ");
		float x=0.0f;
		for (int y=0;y<=1000;y++,x+=0.001f){
			float a=(float)y/1000;
			System.out.printf("%8.7f",x);System.out.print("  ");System.out.printf("%8.7f\n",a);
			System.out.println("");
		}
	}
}