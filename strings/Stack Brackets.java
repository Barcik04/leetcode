class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top = stack.pop();
                if (top == '(' && ch != ')') {
                    return false;
                }

                if (top == '[' && ch != ']') {
                    return false;
                }

                if (top == '{' && ch != '}') {
                    return false;
                }
            }

           
        }

        return stack.isEmpty();
    }
}
