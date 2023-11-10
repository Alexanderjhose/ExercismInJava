/**
 * 
 */
package loglevels;

/**
 * @author jhosep
 *
 */
public class LogLevels {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

//		System.out.println(message("[ERROR]: Invalid operation"));
//
//		System.out.println(message("[WARNING]: Disk almost full\r\n"));

//		System.out.println(logLevel("[ERROR]: Invalid operation"));

		System.out.println(reformat("[INFO]: Operation completed"));

//		LogLevels.reformat("[INFO]: Operation completed")
		// => "Operation completed (info)"

//		System.out.println("Operation completed (info)");

	}

	public static String message(String logLine) {
		return logLine.substring(logLine.indexOf(":") + 1).trim();

	}

	public static String logLevel(String logLine) {
		return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();

	}

	public static String reformat(String logLine) {
		return message(logLine);

	}

}
