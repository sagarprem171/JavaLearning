import java.util.*;

public class Permutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Permutations of " + number + ":");
        findPermutations(Integer.toString(number), "");
    }

    public static void findPermutations(String str, String prefix) {
        int length = str.length();
        if (length == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                String newPrefix = prefix + str.charAt(i);
                String newStr = str.substring(0, i) + str.substring(i + 1);
                findPermutations(newStr, newPrefix);
            }
        }
    }
}