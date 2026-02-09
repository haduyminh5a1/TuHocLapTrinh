package JavaNangCao.leetcode.leetcode;

import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                if(ch == ')' && top != '('){
                    return false;
                }
                if(ch == ']' && top != '['){
                    return false;
                }
                if(ch == '}' && top != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    /*  if (s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); */
    /*if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (bracketMap.containsValue(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != bracketMap.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); */
    /*  char[] arr = s.toCharArray();
        int i=0;
        for(char a: arr){
            if((a&3)==1){
                if(i==0 || (char)(a-arr[--i])>2) return false;
            }else{
                arr[i++]=a;
            }
        }
        return i==0; */
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(isValid(s));
    }
}
