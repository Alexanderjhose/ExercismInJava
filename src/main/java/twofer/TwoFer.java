/**
 * 
 */
package twofer;

import java.util.Objects;

/**
 * @author jhosep
 *
 */
public class TwoFer {

	public static void main(String[] args) {
     //tip your code here...

		System.out.println(twofer(null));
		
	}

	public static String twofer(String name) {
		return Objects.isNull(name) ? "One for you, one for me." : "One for " + name + ", one for me.";

	}

}
