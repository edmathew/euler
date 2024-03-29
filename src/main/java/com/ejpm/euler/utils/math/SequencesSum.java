
package com.ejpm.euler.utils.math;

import com.ejpm.euler.utils.math.prime.PrimeSequence;

/**
 *
 * @author edgar.mateus
 */
public class SequencesSum {
    
    /**
     * Returns the sum of (1*n) + (2*n) 
     * @param divisible
     * @param top
     * @return 
     */
    public static long sumAllDivisibleBy(final int divisible, final long top){
        final long qtd = (top - 1)/divisible;
        
        return divisible * (qtd * (qtd + 1)) / 2;
    }
    
    public static long sumAllPrimeNumbersUnder(final int top){
        final PrimeSequence sequence = new PrimeSequence();
        long sum = 0;
        int prime = sequence.getNext();
        
        while(prime < top){
            sum += prime;
            prime = sequence.getNext();
        }
        
        return sum;
    }

}
