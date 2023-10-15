package Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToIntegerConverter {

    private static final Map<Character, Integer> romanMap = new HashMap<>();

    static {
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && romanMap.get(s.charAt(i)) < romanMap.get(s.charAt(i + 1))) {
                result -= romanMap.get(s.charAt(i));
            } else {
                result += romanMap.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToIntegerConverter converter = new RomanToIntegerConverter();
        System.out.println("Enter Roman Number");
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Roman numeral: " + input + " => Integer: " + converter.romanToInt(input));
    }
}

