package JAVA16_2;

import java.util.Scanner;

public class JAVA16_2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("整数a:");int a=stdIn.nextInt();
		System.out.print("整数b:");int b=stdIn.nextInt();
		try {
			System.out.println("それらの和は"+RangeErrorTester.add(a,b)+"です");
		}catch( RangeError e) {
			if(e instanceof ParameterRangeError ) {
			System.out.println("加える値が範囲外です"+e.getMessage());
			}
			if(e instanceof ResultRangeError ) {
				System.out.println("計算結果が範囲外です"+e.getMessage());
			}
				
			
		}
		}
	}