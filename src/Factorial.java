
public class Factorial {

	static long basicFactorial(int num) {
		return basicFactorial(num, 0);
	}

	static long basicFactorial(long num, long stack) {
		if (num <= 1) {
			// Recursion done
			if (stack != -1) {
				System.out.println("Basic factorial stack depth of " + Long.toString(stack));
			}
			return 1;
		}
		// Recurse
		return num * basicFactorial(num - 1, (stack == -1) ? -1 : stack + 1);
	}

	static long bubbleFactorial(long num) {
		if (num > 1) {
			return bubbleFactorial(num, 1, 0);
		} else {
			return 1;
		}
	}

	static long bubbleFactorial(long max, long min, long stack) {
		if (max == min) {
			// Recursion done
			if (stack != -1) {
				System.out.println("Bubble factorial stack depth of" + Long.toString(stack));
			}
			return max;
		}
		// Recurse
		return bubbleFactorial(max, (min + max + 1) / 2, (stack == -1) ? -1 : stack + 1)
				* bubbleFactorial((min + max - 1) / 2, min, (stack == -1) ? -1 : stack + 1);
	}

	public static void main(String[] args) {
		// Factorial 16
		double prevTime = System.currentTimeMillis();
		System.out.println("Factorial 16:");
		System.out.println(basicFactorial(16));
		double seconds = (prevTime - System.currentTimeMillis()) / 1000.0;
		System.out.println("Time of " + Double.toString(seconds) + " seconds");
		// Bubble 16
		prevTime = System.currentTimeMillis();
		System.out.println("Bubble 16:");
		System.out.println(bubbleFactorial(16));
		seconds = (prevTime - System.currentTimeMillis()) / 1000;
		System.out.println("Time of " + Double.toString(seconds) + " seconds");
		// Factorial 50
		prevTime = System.currentTimeMillis();
		System.out.println("Factorial 60:");
		System.out.println(basicFactorial(60));
		seconds = (prevTime - System.currentTimeMillis()) / 1000;
		System.out.println("Time of " + Double.toString(seconds) + " seconds");
		// Bubble 50
		prevTime = System.currentTimeMillis();
		System.out.println("Bubble 60:");
		System.out.println(bubbleFactorial(60));
		seconds = (prevTime - System.currentTimeMillis()) / 1000;
		System.out.println("Time of " + Double.toString(seconds) + " seconds");

	}

}
