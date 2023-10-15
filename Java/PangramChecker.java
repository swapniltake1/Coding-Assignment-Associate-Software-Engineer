package Java;

import java.util.Scanner;

public class PangramChecker {

    public static boolean checkIfPangram(String input) {
        boolean[] mark = new boolean[26];
        int index;
        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            } else if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (!mark[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter Your String to check....");
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();

        boolean isPangram = checkIfPangram(input.toUpperCase());
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
