import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int number) { //define methode with return
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10; //number of digits at the end
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10; //For the remaining digits when the last number of digits is subtracted.
        }
        return reverseNumber == number; //If the number of palindromes is
    }

    public static void main(String[] args) {

        Scanner doa = new Scanner(System.in);//define scanner
        System.out.print("Enter The Number : "); // get value from user
        int number = doa.nextInt();

        String result = isPalindrome(number) ? "It's Palindrome!!!." : "It isn't, try again...";
        System.out.println(result);
    }
}
