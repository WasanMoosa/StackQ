import java.util.Stack;

public class Paranthese {

	public static void main(String[] args) {
		String sentence = "{}";
		System.out.println("The parantheses of " +sentence+" are ");
		validParantheses(sentence);

	}

	/**
	 * This method takes input of string that has parentheses and check if all
	 * parentheses are closed or no.
	 */
	public static void validParantheses(String sentence) {
		Stack<Character> box = new Stack<>();
		Boolean stop = false;

		for (int i = 0; i < sentence.length() && !stop; i++) {

			if (sentence.charAt(i) == '{') {
				box.push(sentence.charAt(i));
			}

			if (sentence.charAt(i) == '}') {
				if (box.empty()) {
					System.out.print("InValid");
					stop = true;
				} else {
					box.pop();
				}
			}

		}

		if (box.empty() && !stop) {
			System.out.print("Valid");
		}
		if (!box.empty()) {
			System.out.print("InValid");
		}
	}

}
