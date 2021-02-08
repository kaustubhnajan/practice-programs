import java.util.Stack;

public class ParenthesisChecker {

    public static void main(String[] args) {
        check("{([])}");
        check("()");
        check("([]");
    }

    private static void check(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (!stack.isEmpty()) {
                if ((c == ']' && stack.peek() == '[')
                || (c == ')' && stack.peek() == '(')
                || (c == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}
