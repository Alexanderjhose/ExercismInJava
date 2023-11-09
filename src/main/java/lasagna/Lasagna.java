/**
 * 
 */
package lasagna;

/**
 * @author jhosep
 *
 */
public class Lasagna {

	private static final int LASAGNA = 40;
	private static final int MINUTE = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public int expectedMinutesInOven() {
		return LASAGNA;
	}

	public int remainingMinutesInOven(int mints) {
		return expectedMinutesInOven() - mints;
	}

	public int preparationTimeInMinutes(int layers) {
		return layers * MINUTE;
	}

	public int totalTimeInMinutes(int layers, int minute) {
		return preparationTimeInMinutes(layers) + minute;
	}

}
