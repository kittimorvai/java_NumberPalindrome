public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-707));
    }

    public static boolean isPalindrome (int number){
        int reverse = 0;
        int newNumber = number;
        while (newNumber != 0){
            int lastDigit = newNumber % 10;
            newNumber = newNumber / 10;
            reverse = (reverse * 10) + lastDigit;
            if (reverse == number || reverse == number * (-1)){
                return true;
            }

        }
        return false;
    }
}
