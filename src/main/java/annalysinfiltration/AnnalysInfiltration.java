/**
 * 
 */
package annalysinfiltration;

/**
 * @author jhosep
 *
 */
public class AnnalysInfiltration {
	
	public static void main(String[] args) {
		//Tip your code here...
	}

	public static boolean isCanFastAttack(boolean knightIsAwake) {
		return !knightIsAwake;
	}

	public static boolean isCanSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
		return knightIsAwake || archerIsAwake || prisonerIsAwake;
	}

	public static boolean isCanSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
		return !archerIsAwake && prisonerIsAwake;
	}

	public static boolean isCanFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
			boolean petDogIsPresent) {
		return petDogIsPresent && !archerIsAwake || prisonerIsAwake && !knightIsAwake && !archerIsAwake;
	}

}
