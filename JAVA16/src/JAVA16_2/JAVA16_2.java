package JAVA16_2;

import java.util.Scanner;

public class JAVA16_2 {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.print("����a:");int a=stdIn.nextInt();
		System.out.print("����b:");int b=stdIn.nextInt();
		try {
			System.out.println("�����̘a��"+RangeErrorTester.add(a,b)+"�ł�");
		}catch( RangeError e) {
			if(e instanceof ParameterRangeError ) {
			System.out.println("������l���͈͊O�ł�"+e.getMessage());
			}
			if(e instanceof ResultRangeError ) {
				System.out.println("�v�Z���ʂ��͈͊O�ł�"+e.getMessage());
			}
				
			
		}
		}
	}