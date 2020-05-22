class JAVA5_7{
	public static void main(String[] args){
		System.out.printf("%10s","0`1‚Ì0.001‚²‚Æ‚Ì’l");System.out.print("  ");System.out.printf("%10s\n","‘OÒ‚Ì‚Qæ");
		for (int y=0;y<=1000;y++){
			double a=(double)y/1000;
			double b=a*a;
			System.out.printf("%20.19f",a);System.out.print("  ");System.out.printf("%20.19f\n",b);
			System.out.println("");
		}
	}
}