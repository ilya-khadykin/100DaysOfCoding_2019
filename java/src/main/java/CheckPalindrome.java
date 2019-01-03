public class CheckPalindrome {

    public static boolean checkPalindrome(String inputString) {
        inputString = inputString.toLowerCase().trim();
        boolean result = false;
        for(int i = 0; i <= inputString.length() / 2; i++) {
            if (inputString.charAt(i) == inputString.charAt(inputString.length() - (i + 1))) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Used unit tests provided by Codesignal to test my solution, below is just for quick check
        assert checkPalindrome("aabaa");
        assert !checkPalindrome("abac");
        assert checkPalindrome("a");
    }
}
