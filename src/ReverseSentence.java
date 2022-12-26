import java.util.Stack;

public class ReverseSentence {

	public static void main(String[] args) {
		String sentence = "Something";
		reversion(sentence);

	}

	/**
	 * This method takes input of string sentence then reverse it using stack
	 */
	public static void reversion(String sentence) {
		Stack<Character> box = new Stack<>();

		for (int i = 0; i < sentence.length(); i++) {

			box.push(sentence.charAt(i));
		}
		while (!box.empty()) {
			System.out.print(box.pop());
		}

	}

}
