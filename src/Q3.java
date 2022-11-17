
public class Q3 {
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() -1;
		boolean isPal = true;
		
		while(i<=j) {
			if(str.charAt(i) != str.charAt(j)) {
				isPal = false;
				break;
			}
			i++;
			j--;
		}
		return isPal;
	}
	
	public static void main(String[] args) {
		// WAP to check if “2552” is palindrome or not.
		String str = "2552";
		if(isPalindrome(str)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
	}

}
