package JAVA16_2;

public class RangeErrorTester {
	static boolean isValid(int n) {
		return n>=0&&n<=9;
	}
	public static int add(int a,int b) throws ParameterRangeError,ResultRangeError{
		if(!isValid(a)) {throw new ParameterRangeError(a);}
		if(!isValid(b)) {throw new ParameterRangeError(b);}
		int result=a+b;
		if(!isValid(result)) {throw new ResultRangeError(result);}
		return result;
	}
}
