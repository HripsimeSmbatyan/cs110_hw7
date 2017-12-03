package Utils;

public class Math {
	
	public static long factorial(int num) {
		if(num == 0) {
			return 1;
		} else if (num < 0) {
			return;
		} else 
		return (num * factorial(num-1));
	}
	
	public static long factorialLoop(int num) {
		long result = 1;
		for(int i = num; i > 0; i--) {
			result = result * i;
		}
		return result;
	}
}