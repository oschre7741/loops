/**
 * Complete each loop problem and test in main.
 * 
 * @author YOU
 * @version TODAY
 */

public class ForLoopPractice 
{
    // Return the sum of all ints in the range a to b inclusive.
    public static int sum(int a, int b) {
        int sum = 0;
        
        for (int i=a; i<=b; i++) {
            sum += i;
          }
        
        return sum;
    }
    
    // Return the sum of all even ints in the range a to b inclusive.
    public static int sumRange(int a, int b) {
        int sum = 0;
        
        for (int i=a; i<=b; i+=2) {
            if (a % 2 == 0) {
                sum += i;
            }
            else {
            }
       }
           
        return sum;
    }

    // Return the sum of all ints in the range 1 to n that are evenly divisible by both a and b.
    public static int sumAndDiv(int n, int a, int b) {
        int sum = 0;
        
        for (int i=1; i<=n; i++) {
            if (i % a == 0 && i % b == 0) {
                sum += i;
            }
            else {
            }
           }
           
        return sum;
    }
    
    // Return the sum of all ints in the range 1 to n that are evenly divisible by a or b.
    public static int sumOrDiv(int n, int a, int b) {
        int sum = 0;
        
        for (int i=1; i<=n; i++) {
            if (i % a == 0 || i % b == 0) {
                sum += i;
            }
            else {
            }
           }
        
        return sum;
    }

    // Return the sum of all ints in the range 1 to n that are evenly divisible by a or b but not both.
    public static int sumXOrDiv(int n, int a, int b) {
        int sum = 0;
        
        for (int i=1; i<=n; i++) {
            if ((i % a == 0)^(i % b == 0)) {
                sum += i;
            }
            else {
            }
           }
        
        return sum;
    }

    // Return the sum of the first n perfect squares.
    public static int sumSquares(int n) {
        int sum = 0;
        
        for (int i=1; i<=n; i++) {
            sum += Math.pow(i, 2);
           }
        
        return sum;
    }

    // Return true if an int n contains the digit d, and false otherwise.
    public static boolean hasDigit(int n, int d) {
        for (int i=0; i<=n; i++) {
            n = n / 10;
            if (d == n % 10) {
                 return true;
            }
            else {
            }
        }
        
        return false;
    }

    // Return the sum of digits in an int.
    public static int sumDigits(int n) {
        int sum = 0;
        
        for (int i=0; i<=n; i++) {
            int dig = n % 10;
            n = n / 10;
            sum += dig;
        }
        
        return sum;
    }


    // Return the sum of all odd digits in an int.
    public static int sumOddDigits(int n) {
        int sum = 0;
        
        for (int i=0; i<=n; i+=2) {
            int dig = n % 10;
            n = n / 10;
            
            if (dig % 2 != 0) {
                sum += dig;
            }
            else{
            }
        }
        
        return sum;
    }


    // Return true if the number of even digits in an int is greater than the number of odd digits
    public static boolean moreEvens(int n) {
        int oddCount = 0;
        int evenCount = 0;
        
        for (int i=0; i<=n; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
            else if (i % 2 != 0) {
                oddCount++;
            }
        }
        
        if (evenCount > oddCount) {
                return false;
        }
        else {
            return true;
        }
    }
    

    // Return String str with the characters in reverse order. 
    public static String reverse(String str) {
        String rev = "";
        
        for (int i=0; i<str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        
        return rev;
    }
    
    
    // Return the sum of the unicode values of the characters in str.
    public static int unicodeSum(String str) {
        int sum = 0;
        
        for (int i=0; i<str.length(); i++) {
            sum += str.charAt(i);
        }
        
        return sum;
    }
    

    // Return true if str is a palindrome. All input will contain only lowercase letters.
    public static boolean easyPalindrome(String str) {
        int mid = str.length()/2;
        for (int i=0; i<mid; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        
        return true;    
    }

    
    // Return String str with all non-capital letters removed.
    public static String noCaps(String str) {
        for (int i=0; i<str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                str = str.substring(0, i) + str.substring(i+1, str.length());
                i--;
            } 
            else {
            }
        }
        
        return str;
    }

    
    // Return String str with all capital letters turned to lowercase and lowercase to capital. Any other characters should remain unchanged.
    public static String capSwap(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result = result + Character.toLowerCase(str.charAt(i));
            }
            else if (Character.isLowerCase(str.charAt(i))) {
                result = result + Character.toUpperCase(str.charAt(i));
            } 
            else { 
                return result + str.charAt(i);
            }
        }
        
        return result;
    }
    
    
    // Return true if str is a palindrome with respect to letters only. 
    public static boolean hardPalindrome(String str) {
        String stripped = "";
        str = str.toLowerCase();
        
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            
            if (c>=97 && c<=122) {
                stripped += c;
            }
        }
        
        return easyPalindrome(stripped);
    }

    
    // Return the factorial of n.
    public static int factorial(int n) {
        int factorial = 1;
        
        for (int i=1; i<=n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    
    // Return the nth term in the Fibonacci sequence beginning with {0, 1, 1, 2, ...}
    public static int nthFib(int n) {
        int num = 0;
        int num2 = 1;
        
        for (int i=1; i<=n; i++) {
            int fib = num + num2;
            num = num2;
            num2 = fib;
        }
        
        return num;
    }
    

    public static void main(String[] args)
    {
        System.out.println( sum(5,10) );
        System.out.println( reverse("hello") );
        System.out.println( easyPalindrome("hello") );
        System.out.println( easyPalindrome("racecar") );
        System.out.println( easyPalindrome("Madam, I'm adam.") );
        System.out.println( hardPalindrome("Madam, I'm adam.") );
    }
    
}
