package ch03;

import java.util.Random;

public class Season {

	private static Random random = new Random();

	public String getSeason () {
		int n = random.nextInt(12);

		if (n < 3) {
			return "Winter";
		} else if (n < 6) {
			return "Spring";
		} else if (n < 9) {
			return "Summer";
		} else {
			return "Autumn";
		}
	}

}