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

	public static boolean canFastAttack(boolean knightIsAwake) {
		return !knightIsAwake;
	}

	public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
		return knightIsAwake || archerIsAwake || prisonerIsAwake;
	}

	public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
		return !archerIsAwake && prisonerIsAwake;
	}

	public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
			boolean petDogIsPresent) {
		return petDogIsPresent && !archerIsAwake || prisonerIsAwake && !knightIsAwake && !archerIsAwake;
	}

}
