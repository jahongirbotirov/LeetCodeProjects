package ValidParentheses;

import java.util.Scanner;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s){
        int n = s.length();
        if (n==1|| s.charAt(0)==']' || s.charAt(0)== ')' || s.charAt(0) == '}')
            return false;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i< n; i++){
            if (s.charAt(i) == '[' || s.charAt(i)=='(' || s.charAt(i) == '{')
                str.append(s.charAt(i));
            else {
                int m = str.length();
                if (m == 0)
                    return false;
                if ((str.charAt(m-1) == '[' && s.charAt(i)!=']') ||
                        (str.charAt(m-1) == '{' && s.charAt(i) == '}') ||
                        (str.charAt(m-1) == '(' && s.charAt(i) == ')'))
                    return false;
            str.deleteCharAt(m-1);
            }
        }
        if (str.length()!= 0)
            return true;
        return true;
    }
}
