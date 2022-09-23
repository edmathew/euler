
package com.ejpm.euler.utils.math;

/**
 *
 * @author edgar.mateus
 */
public class PalindromeUtils {
    
    public static boolean isPalindrome(final int number){
        int n = number;
        int reversed = 0;
        while(n != 0){
            final int remainder = n %10;
            reversed = reversed * 10 +remainder;
            n /= 10;
        }
        
        return reversed == number;
    }

}
