package week01;

public class Task17 {

	public static void main(String[] args) {
		System.out.println(reverseMe(""));
	}
	
	public static String reverseMe(String argument) {
		StringBuilder builder = new StringBuilder(argument);
		return builder.reverse().toString();
	}
}
