class PalindromeChecker {
    private String text;

    
    public PalindromeChecker(String text) {
        this.text = text;
    }

    
    public boolean isPalindrome() {
        String str = text.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) { 
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}

public class palindrom {
    public static void main(String[] args) {
        PalindromeChecker p=new PalindromeChecker("naman"); 
        p.displayResult();
    }
}
