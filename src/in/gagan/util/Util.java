package in.gagan.util;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public abstract class Util {
	
	private Util() {}
	
	public static int[] generateArray(int size) {
		// generate set of sequential values from 0 ... desiredSize * 3
	    int[] set = IntStream.range(0,  size * 3).toArray();

	    // shuffle them
	    int index = set.length;
	    
	    // Fisher-Yates.
	    Random rand = new Random();
	    while (index > 1) {
	        final int pos = rand.nextInt(index--);
	        final int tmp = set[pos];
	        set[pos] = set[index];
	        set[index] = tmp;
	    }

	    // return the first batch of them
	    return Arrays.copyOf(set, size);
	}
	
	public static void printArray(int[] baseArr) {
		for(int i: baseArr) {
			System.out.print(i + ", ");
		}
		System.out.print("\n");
	}
	
	public static void threadSleep(long sleepTime) {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void swapVariables(int var1, int var2) {
		int tmp = var1;
		var1 = var2;
		var2 = tmp;
	}

}
