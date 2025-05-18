package Stack_and_Queues;

import java.util.*;

public class postfix_notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int evalRPN(String[] tokens) {
		Stack<Integer> stk = new Stack<>();
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (token.equals("/") || token.equals("*") || token.equals("+") || token.equals("-")) {
				int num1 = stk.pop();
				int num2 = stk.pop();
				int result = 0;
				switch (token) {
				case "+":
					result = num2 + num1;
					break;
				case "-":
					result = num2 - num1;
					break;
				case "*":
					result = num2 * num1;
					break;
				case "/":
					result = num2 / num1;
					break;
				}
				stk.push(result);

			}else {
				stk.push(Integer.parseInt(token));
			}
		}
		return stk.pop();
	}

}
