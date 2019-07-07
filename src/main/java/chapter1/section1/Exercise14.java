package chapter1.section1;

public class Exercise14 {

	public static int lg(int n) {
		int i = 0;
		int two_power_of_i = 1;
		while (two_power_of_i * 2 <= n) {
			i++;
			two_power_of_i = two_power_of_i * 2;
		}
		return i;
	}
}
