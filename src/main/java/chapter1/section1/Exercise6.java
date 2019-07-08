package chapter1.section1;

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rene Argento
 */
public class Exercise6 {
	static void originalImpl() {
		int f = 0;
		int g = 1;

		for (int i = 0; i <= 15; i++) {
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}

	static void alternativeImpl() {
		List<Integer> fibonacci = new ArrayList<>();
		fibonacci.add(0);
		fibonacci.add(1);
		StdOut.println(fibonacci.get(0));
		StdOut.println(fibonacci.get(1));
		for (int i = 2; i <= 15; i++) {
			fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
			StdOut.println(fibonacci.get(i));
		}
	}
}
